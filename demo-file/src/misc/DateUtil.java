package misc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateUtil {
    public static boolean isDate(String stringDate, String format) {
        int dd, mm, yy;
        boolean leapyear = false;
        
        try {
        	switch (format) {
            case "ddMMyy":
            case "ddMMyyyy":
                dd = Integer.parseInt(stringDate.substring(0, 2));
                mm = Integer.parseInt(stringDate.substring(2, 4));
                yy = Integer.parseInt(stringDate.substring(4));
                break;
            case "dd-MM-yyyy":
            case "dd/MM/yyyy":
                dd = Integer.parseInt(stringDate.substring(0, 2));
                mm = Integer.parseInt(stringDate.substring(3, 5));
                yy = Integer.parseInt(stringDate.substring(6));
                break;
            case "yyyyMMdd":
                yy = Integer.parseInt(stringDate.substring(0, 4));
                mm = Integer.parseInt(stringDate.substring(4, 6));
                dd = Integer.parseInt(stringDate.substring(6));
                break;
            case "yyyy-MM-dd":
            case "yyyy/MM/dd":
                yy = Integer.parseInt(stringDate.substring(0, 4));
                mm = Integer.parseInt(stringDate.substring(5, 7));
                dd = Integer.parseInt(stringDate.substring(8));
                break;
            default:
                dd = 0;
                mm = 0;
                yy = 0;
                break;
        }

        if (yy % 2 == 0) {
            if (yy % 4 == 0) {
                leapyear = true;
            }
        }
        if (mm < 1 || mm > 12) {
            return false;
        } else {
            switch (mm) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dd < 1 || dd > 31) {
                        return false;
                    }
                case 2:
                    if (leapyear) {
                        if (dd < 1 || dd > 29) {
                            return false;
                        }
                    } else {
                        if (dd < 1 || dd > 28) {
                            return false;
                        }
                    }
                default:
                    if (dd < 1 || dd > 30) {
                        return false;
                    }
            }
        }
        return true;
        }
        catch(Exception ex) {
        	return false;
        }
        
        
    }

    public static Date stringToDate(String date, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.parse(date);
        } catch (ParseException ex) {
            return null;
        }
    }

    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static int getAge(Date birthDate) {
        int age = 0;
        if (birthDate == null) {
            return age;
        }
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        LocalDate localDate = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int byear  = localDate.getYear();
        int bmonth = localDate.getMonthValue();
        int bday   = localDate.getDayOfMonth();


        //la diferencia
        age = year - byear;
        if (month < bmonth) {
            age = age - 1;
        } else {
            if (month == bmonth) {
                if (day < bday) {
                    age = age - 1;
                }
            }
        }
        return age;
    }

    public static Date catchValidDate(Scanner scan, String promptText) {
    	Date date = null;
    	do {
    		System.out.println(promptText);
    		String dateString = scan.next();
    		if(isDate(dateString, "dd/MM/yyyy")) {
    			date = stringToDate(dateString, "dd/MM/yyyy");
    		}
    		else {
    			System.out.println("El valor no es válido.");
    		}
    	}while(date==null);
    	
    	return date;
    }
    
    public static Date addYears(Date input, int years) {
    	Date output;
    	try {
            LocalDate localDate = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int year  = localDate.getYear();
            int month = localDate.getMonthValue();
            int day   = localDate.getDayOfMonth();
            
            int outyear = year + years;
            String stringDate = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(outyear);
            output = stringToDate(stringDate, "dd/MM/yyyy");
            
            return output;
            
    	}
    	catch(Exception ex) {
    		return input;
    	}
    }
}

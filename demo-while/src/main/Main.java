package main;

public class Main {

	public static void main(String[] args) {
		String[] students = new String []{"María", "Juan", "Roberto"};
		int i = 0;
		while(i<students.length) {
			System.out.printf("Nombre de estudiante %d: %s", i+1, students[i]);
			System.out.println();
			i++;
		}
	}

}

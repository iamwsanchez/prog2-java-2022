package misc;

public class Comparator {
	private int [] numbers;

	public Comparator() {
		super();
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	public void compare() {
		int theLargest = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>theLargest) {
				theLargest = numbers[i];
			}
		}
		System.out.printf("El número mayor es: %d.", theLargest);
	}
}

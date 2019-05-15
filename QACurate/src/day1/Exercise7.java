package day1;

public class Exercise7 {

	public static void main(String[] args) {
		int sum = 0;
		int int1;
		System.out.println("Enter the value of the number integer: " + args[0]);
		int1 = Integer.parseInt(args[0]);
		for (int i = 1; i <= int1 ; i++) {
			sum = sum + i;
		}
		System.out.println("The value of Sum is " + sum);
	}

}

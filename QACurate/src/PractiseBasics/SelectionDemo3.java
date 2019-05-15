package PractiseBasics;

public class SelectionDemo3 {

	public static void main(String[] args) {
		String n = "c";

		/*
		 * if (n==1) System.out.println("one"); else if(n==2) System.out.println("two");
		 * else if(n==3) System.out.println("three"); else if(n==4)
		 * System.out.println("four");
		 */

		switch (n) {
		case "A":
			System.out.println("one");
			break;
		case "N":
			System.out.println("two");
			break;
		case "C":
			System.out.println("three");
			break;
		case "S":
			System.out.println("four");
			break;
		case "c":
			System.out.println("five");
			break;
		default:
			System.out.println("no match");
			;

		}

	}

}

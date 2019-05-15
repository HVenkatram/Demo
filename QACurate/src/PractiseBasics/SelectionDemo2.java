package PractiseBasics;

public class SelectionDemo2 {

	public static void main(String[] args) {
		int i = 4;
		int j = 0;
		
/*		if (i>5) 
			j=78;
		else 
			j=100;*/
			
		// ternary operator ?:expr1:expr2
		j = i>6?88:2;
		
		System.out.println(j);
	}

}

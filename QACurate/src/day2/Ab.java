package day2;

class X{
	int i=100;
	X(){
		System.out.println("This is from class X");
	}
}

class Ab {

	public static void main(String[] args) {
		X x1 = new X();
		System.out.println(x1.i);
		System.out.println("Hello");

	}

}

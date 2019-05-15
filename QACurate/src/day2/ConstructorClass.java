package day2;

class A{
	
}

public class ConstructorClass {
	public ConstructorClass() {
		//First line of the constructor should be this or super, only one this 
		// or super(no multiple this and super) either this or super not both.
		//this("sapient");
		// Contructor can be overloaded i.e multiple arguments.
		// Constructor can be chained  - When one constructor calls another calls another constructor.
	
		System.out.println("This is default");
	}
	public ConstructorClass(int i) {
	}
	public ConstructorClass(String name) {
		System.out.println("This is string constructor");
	}
	public ConstructorClass(String name, int i) {
	}
	public ConstructorClass(double d) {
	}
	public ConstructorClass(double d, String name, int i) {
	}
	public ConstructorClass(A a) {
	}
	
	public static void main(String[] args) {
		A aa = new A();
		ConstructorClass cus = new ConstructorClass("s");
	}
	
	
}


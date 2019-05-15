package day2;

class B {
	static void test()
	{
		System.out.println("have a nice day");
	}

	B()
	{
		System.out.println("B's constructor");
	}

	{
		System.out.println("B's Static Initializatin Block");
	}
	{
		System.out.println("B's Instance Initialization Block");
	}
};

class Manager {
	public static void main(String[] args) {
		B b = new B();
		B.test();
	}
}

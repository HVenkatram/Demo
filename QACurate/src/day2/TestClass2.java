
package day2;

class Employee{
	
	int age=66;
	static String name;
	static void display(int i) {
		System.out.println("Employee.display()"+ i) ;
		System.out.println("Employee.display1()"+ i) ;

		
	}
	static void display1(int i) {
		System.out.println("Employee.display()"+ i) ;
		System.out.println(name);
		//System.out.println(id);

	}
	void show1() {
		System.out.println("Employee.show1()");
		show2();
		display(11);
		//System.out.println(id);
		System.out.println(name);

	}
	void show2() {
		System.out.println("Employee.show2()");

	}
	
}



public class TestClass2 {


	public static void main(String[] args) {
		Employee.name = "raghu";
		System.out.println(Employee.name);
		Employee.display(11);
		System.out.println("  name is " +  Employee.name);
		//
		new Employee().show1();
		new Employee().name = "Publi";
		System.out.println(Employee.name);

	}

}



package day2;

class Person{
	//Instances Variables
	int age=66;
	double weight;
	double height;
	
	//Method
	void showDays() {
		System.out.println();
	}

}



public class TestClass {


	public static void main(String[] args) {
		//  Auto-generated method stub
		Person person=  new Person();
		person.age =244;
		person.weight=56.66;
		person.showDays();
		System.out.println("Person age is  " + person.age + "  weight is " + person.weight);
	}

}


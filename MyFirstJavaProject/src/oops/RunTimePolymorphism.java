package oops;

class Student {
	void print() {
		System.out.println("Student id is 123456");
	}

	void display() {
		System.out.println("Display the name");
	}
}

class Employee extends Student {
	void print() {
		System.out.println("Employee id is EM001");
		super.print();
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Employee e = new Employee();
		//upcasting = Parent to child
		Student c = new Employee();
		c.display();
		c.print();
		e.display();
		e.print();
		//downcasting - child to Parent 
		Student s1 = new Employee();
		Employee e1 = (Employee) s1;
		e1.display();
		e1.print();

	}

}

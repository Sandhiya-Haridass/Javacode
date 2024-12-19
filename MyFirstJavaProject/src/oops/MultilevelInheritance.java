package oops;
class Animal{
	void eat() {
		System.out.println("Eat");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Bark");
		
	}
	
}
class BabyDog extends Dog{
	void cry() {
		System.out.println("cry");
	}
}





public class MultilevelInheritance {

	public static void main(String[] args) {
		BabyDog b =new BabyDog();
		b.bark();
		b.cry();
		b.eat();
		

	}

	
	}



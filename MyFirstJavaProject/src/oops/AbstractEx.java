package oops;
abstract class Name{  //abstract class
	abstract void StudentName();//method without body cannot create a object for Abstract class
	void collegeName() {
		System.out.println("Chennai college");
	
}
}
class Preethi extends Name{

	@Override
	void StudentName() {
		System.out.println("Preethi");
		
	}
	
}
class Jeni extends Name{
	@Override
	void StudentName() {
		System.out.println("Jeni");
	}
	
}



public class AbstractEx {

	public static void main(String[] args) {
		Preethi p = new Preethi();
		p.StudentName();
		Jeni j = new Jeni();
		j.StudentName();
		j.collegeName();
		System.out.println("********");
		Name cref;
		cref = p;
		cref.StudentName();
		cref.collegeName();
		Name cref1;
		cref1 = j;
		cref1.StudentName();
		cref1.collegeName();

	}

}

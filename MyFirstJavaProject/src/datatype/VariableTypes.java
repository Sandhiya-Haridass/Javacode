package datatype;
class VariableDemo{
	static int count=0;//static variable 
    int cnt=0;//instance variable
    public void increment() {
    	count++;
    }
    public void incr() {
    	cnt++;
    }
}
/*
 * static variables are shared among all the instances of the class, they are
 * useful when we need to do memory management. In some cases we want to have a
 * common value for all the instances like global variable then it is much
 * better to declare them static as this can save memory (because only single
 * copy is created for static variables).
 */

public class VariableTypes {

	public static void main(String[] args) {
		VariableDemo obj1=new VariableDemo();
		VariableDemo obj2=new VariableDemo();
		VariableDemo obj3=new VariableDemo();
		VariableDemo obj4=new VariableDemo();
		obj1.increment();
		obj2.increment();
		obj3.incr();
		obj4.incr();
		System.out.println("Static Obj1:"+obj1.count);
		System.out.println("Static obj2:"+obj2.count);
		System.out.println("instance obj3:"+obj3.cnt);
		System.out.println("instance obj4:"+obj4.cnt);
		
	}

}

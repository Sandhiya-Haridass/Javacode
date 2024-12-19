package Function;
//outside the class creating static - call using class name 
class Area{
	static int AreaofRectangle(int l, int b, int h) {
		return l*b*h;
	}
}
public class TypeOfFunctions {
	//no returntype 2 parameter
	void add(int a, int b) {
		System.out.println("Addition"+a+b);
	}
	//no returntype no parameter
	void Display() {
		System.out.println("Display");
	}
    //return type with parameter
	int mul(int a,int b) {
		return a*b;
		
	}
	//return type with string 
	String disMsg(String nm) {
		return "Welcome" +nm;
		
	}
	//Inside the class creating a static
	static double area(int r) {
		return 3.14*r*r;
		
	}
	public static void main(String[] args) {
		TypeOfFunctions t = new TypeOfFunctions();
		int m=t.mul(2, 3);
		System.out.println("Multiplication "+m);
		System.out.println("Multi "+t.mul(10, 20));
		String s = t.disMsg(" to EduBridge");
		System.out.println(s);
		double ar = area(4);
		System.out.println("Area of Circle "+ar);
		int are=Area.AreaofRectangle(3, 4, 5);
		System.out.println("Area of Rectangle " +are);
		
		

	}

}

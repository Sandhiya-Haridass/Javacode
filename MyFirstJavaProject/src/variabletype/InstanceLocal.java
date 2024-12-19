package variabletype;

public class InstanceLocal {
	void display() {
		System.out.println("Display");
	}
	void displayMsg() {
		System.out.println("*******DisplayMsg********");
	}

	public static void main(String[] args) {
			String s ="Hello";
			System.out.println("Length :"+s.length());
			System.out.println("Char at :"+s.charAt(0));
			InstanceLocal i=new InstanceLocal();
			i.display();
			i.displayMsg();
					
	}

}

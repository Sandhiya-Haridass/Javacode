package Selection;

public class Switch {

	public static void main(String[] args) {
		String grade ="E";
		switch(grade) {
		case "A":
			System.out.println("Percentage is between 100 to 90 ");
			break;
		case "B":
			System.out.println("Percentage is between 89 to 70 ");
			break;
		case "C":
			System.out.println("Percentage is between 69 to 50");
			break;
		case "D":
			System.out.println("Percentage is between 49 to 35");
			break;
		default:
			System.out.println("Fail");
		
			
		}

	}

}

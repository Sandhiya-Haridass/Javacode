package Selection;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Percentage");
		int per =sc.nextInt();
		if(per<=100 && per>=90) {
			System.out.println("A+ Grade");
		}
		else if(per<90 && per>=70) {
			System.out.println("A Grade");
		}
		else if(per<70 && per>=50) {
			System.out.println("B+ Grade");
		}
		else if(per<50 && per>=40) {
			System.out.println("B Grade");
		
		}
		else if(per<40 && per>=35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
			
		

	}

}

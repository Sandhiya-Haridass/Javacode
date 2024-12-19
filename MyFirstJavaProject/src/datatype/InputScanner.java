package datatype;

import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name RollNo Percentage Symbol");
		String name=sc.nextLine();
		int rollno=sc.nextInt();
		float percentage=sc.nextFloat();
		char ch=sc.next().charAt(0);
		System.out.println("name:"+name);
		System.out.println("rollno:"+rollno);
		System.out.println("percentage:"+percentage);
		System.out.println("symbole:"+ch);
		
		
		
		
		

	}

}

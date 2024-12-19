package datatype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name RollNo Percentage Symbol");
		String name=br.readLine();
		int rollno=Integer.parseInt(br.readLine());
		float percentage=Float.parseFloat(br.readLine());
		char ch=br.readLine().charAt(0);
		System.out.println("name:"+name);
		System.out.println("rollno:"+rollno);
		System.out.println("percenatge:"+percentage);
		System.out.println("Symbol:"+ch);
		
		

	}

}

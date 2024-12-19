package Function;

import java.util.Scanner;

public class CalDist {
	int equation(int u, int a, int t) {
		return u*t+((a*t*t)/2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalDist cd = new CalDist();
		int u = 36;
		u = (u*1000)/3600;
		int a =5;
		int t1=sc.nextInt();
		int t2=sc.nextInt();
		int e =cd.equation(u,a,t1);
		int e2=cd.equation(u, a, t2);
		System.out.println(e);
		System.out.println(e2);
		
		

	}

}

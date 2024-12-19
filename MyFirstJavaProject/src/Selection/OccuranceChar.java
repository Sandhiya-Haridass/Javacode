package Selection;

public class OccuranceChar {

	public static void main(String[] args) {
		String s ="Hello";
		int totalcount = s.length();
		System.out.println(totalcount);
	    int countafterremovel = s.replace("l", "").length();
	    System.out.println(countafterremovel);
		int count = totalcount-countafterremovel;
		System.out.println("Number of Occurance:" +count);

	}

}

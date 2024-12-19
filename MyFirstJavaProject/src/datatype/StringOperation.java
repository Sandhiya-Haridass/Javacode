package datatype;

public class StringOperation {

	public static void main(String[] args) {
		String s ="Hello Java";
		String s1 = new String("Welcome");
		String s2 = "welcome";
		String s3 = "    ";
		System.out.println("Lenght:"+s.length());
		System.out.println("char at :"+s1.charAt(3));
		System.out.println("uppercase :"+s2.toUpperCase());
		System.out.println("lowercase:"+s2.toLowerCase());
		System.out.println("equals :"+s1.equals(s2));
		System.out.println("equalsignore:"+s1.equalsIgnoreCase(s2));
		System.out.println("compare to :"+s1.compareTo(s));
		System.out.println("compare to :"+s.compareTo(s1));
		System.out.println("indexof:"+s1.indexOf('e'));
		System.out.println("last index of:"+s1.lastIndexOf('e'));
		System.out.println("Concat :"+s1.concat(" Class"));
		System.out.println("is blank:"+s3.isBlank());
		System.out.println("is Empty:"+s3.isEmpty());
		
	}

}

package datatype;

class StaticVar{
	static int score;
	static String name="Subject Score";

static void DisplayMsg() {
	String cname="Java Full Stack";
	System.out.println("Course Name:"+cname);
}
void msg() {
	System.out.println("Java");
}
  
}

public class StaticVariable {
	

	public static void main(String[] args) {
		StaticVar s=new StaticVar();
		s.msg();
		StaticVar.score =90;
		StaticVar.name="Score";
		StaticVar.DisplayMsg();
		System.out.println("Score:"+StaticVar.score +" Name:"+StaticVar.name);
		

	}

}

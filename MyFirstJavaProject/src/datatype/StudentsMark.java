package datatype;

public class StudentsMark {
	int mathMark;
	int scienceMark;
	int EnglishMark;
	int historyMark;


	public static void main(String[] args) {
		StudentsMark stud1=new StudentsMark();
		stud1.mathMark=50;
		stud1.scienceMark=90;
		stud1.EnglishMark=90;
		stud1.historyMark=69;
		StudentsMark stud2=new StudentsMark();
		stud2.mathMark=50;
		stud2.scienceMark=90;
		stud2.EnglishMark=90;
		stud2.historyMark=69;
		System.out.println("Maths:"+stud1.mathMark+" Science:"+stud1.scienceMark+" English:"+stud1.EnglishMark+" History"+stud1.historyMark);
		System.out.println("Maths:"+stud2.mathMark+" Science:"+stud2.scienceMark+" English:"+stud2.EnglishMark+" History"+stud2.historyMark);
				
		
		
		
	}

}

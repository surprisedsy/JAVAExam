package question3;

public class Student {
	
	int id;
	String name;
	int subnum;
	Test[] test;
	
	public Student(int id, String name, int subnum)
	{
		this.id = id;
		this.name = name;
		this.subnum = subnum;
		test = new Test[subnum];
		
		
		
		
		// 코드 추가 필요
		
		
		
		
		
		
	}
	
	String getName()
	{
		return this.id + ":" + this.name; 		
	}
	
	int getGrade()
	{
		int sum = 0;
		
		// 코드 추가 필요
		
		
		return sum;
	}
	
	void printScore()
	{
		System.out.println(getName());
		
		
		// 코드 추가 필요
		
		
		System.out.println("총점 : " + getGrade());
		System.out.println("*******************************");
	}
}

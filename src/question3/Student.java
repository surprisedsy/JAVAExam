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
		
		
		
		
		// �ڵ� �߰� �ʿ�
		
		
		
		
		
		
	}
	
	String getName()
	{
		return this.id + ":" + this.name; 		
	}
	
	int getGrade()
	{
		int sum = 0;
		
		// �ڵ� �߰� �ʿ�
		
		
		return sum;
	}
	
	void printScore()
	{
		System.out.println(getName());
		
		
		// �ڵ� �߰� �ʿ�
		
		
		System.out.println("���� : " + getGrade());
		System.out.println("*******************************");
	}
}

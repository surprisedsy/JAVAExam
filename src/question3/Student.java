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
		for(int i = 0; i < subnum; i++)
		{
			test[i] = new Test();
		}
		
	}
	
	String getName()
	{
		return this.id + ":" + this.name; 		
	}
	
	int getGrade()
	{
		int sum = 0;
		
		for(int i = 0; i < test.length; i++)
		{
			sum += test[i].point;
		}
		
		return sum;
	}
	
	void printScore()
	{
		System.out.println(getName());
		
		for(int i = 0; i < test.length; i++)
		{
			System.out.println(test[i].getPoint());
		}
				
		/*System.out.println(test[0].getPoint());
		System.out.println(test[1].getPoint());
		System.out.println(test[2].getPoint());*/
		
		System.out.println("���� :" + getGrade());
		System.out.println("*******************************");
	}
}

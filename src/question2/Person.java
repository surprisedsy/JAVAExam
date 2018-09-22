package question2;

public class Person {

	static int numberOfPerson = 0;
	
	int age;
	String name;

	public Person() {
		numberOfPerson++;
		this.age = 12;
		this.name = "";
	}

	public Person(int age, String name) {
		numberOfPerson++;
		this.age = age;
		this.name = name;
	}
	
	public void selfIntroduce()
	{
		System.out.println("�� �̸��� " + name + "�̸�, ���̴� " + age + "�� �Դϴ�.");
	}
	
	public static int getPopulation()
	{			
		System.out.println("���� �α� ���� " + numberOfPerson + "�� �Դϴ�.");
		return numberOfPerson;
	}

}

package question2;

public class Person {

	int numberOfPerson;
	int age;
	String name;

	public Person() {}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void selfIntroduce()
	{
		System.out.println("�� �̸��� " + name + "�̸�, ���̴� " + age + "�� �Դϴ�.");
	}
	
	public int getPopulation()
	{		
		for(int i = 0; i < name.length(); i++)
		{
			numberOfPerson += 1;
			System.out.println("���� �α� ���� " + (numberOfPerson) + "�� �Դϴ�.");
		}
		
		return numberOfPerson;
	}

}

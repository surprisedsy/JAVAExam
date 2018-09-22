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
		System.out.println("내 이름은 " + name + "이며, 나이는 " + age + "살 입니다.");
	}
	
	public int getPopulation()
	{		
		for(int i = 0; i < name.length(); i++)
		{
			numberOfPerson += 1;
			System.out.println("현재 인구 수는 " + (numberOfPerson) + "명 입니다.");
		}
		
		return numberOfPerson;
	}

}

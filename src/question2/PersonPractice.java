package question2;

public class PersonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person(12, "");
		
		person.name = "김자바";
		person.getPopulation();
		person.selfIntroduce();
		
		person.name = "박자바";
		person.age = 27;
		person.selfIntroduce();
		
		person.name = "이자바";
		person.age = 28;
		person.selfIntroduce();
	}

}

package question2;

public class PersonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person(12, "김자바");
		person.getPopulation();
		Person person1 = new Person(27, "박자바");
		person.getPopulation();
		Person person2 = new Person(28, "이자바");
		person.getPopulation();	
		
		person.selfIntroduce();
		person1.selfIntroduce();
		person2.selfIntroduce();
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> listPersons = new ArrayList<>();

		listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));

		listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));

		listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));

		listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));

		listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));

		listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));

		listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));

		listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));

		listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));

		listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));
		
		List<String> emailList = listPersons.stream()
								.filter(person -> person.getGender().equals(Gender.MALE))
								.map(person -> person.getEmail())
								.collect(Collectors.toList());
		
		emailList.forEach(email -> System.out.println(email));
	}

}

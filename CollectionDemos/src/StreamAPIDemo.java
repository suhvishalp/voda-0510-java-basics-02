import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List< Student > listStudents = new ArrayList<>();

		listStudents.add(new Student(101, "Alice", "3333", 82));

		listStudents.add(new Student(102, "Bob","2222", 90));

		listStudents.add(new Student(103, "Carol", "3434", 67));

		listStudents.add(new Student(104,"David", "6533",80));

		listStudents.add(new Student(105,"Eric", "2344",55));

		listStudents.add(new Student(106,"Frank","6655", 49));

		listStudents.add(new Student(107,"Gary", "2233",88));

		listStudents.add(new Student(108,"Henry","5542", 98));

		listStudents.add(new Student(109,"Ivan", "6556",66));

		listStudents.add(new Student(110,"John","7661", 52));
		
		
//		for(Student student: listStudents) {
//			if(student.getMarks() >= 70)
//				System.out.println(student);
//		}
	
	  
		
//		listStudents.stream()
//			.filter( student  -> student.getMarks() >= 70)
//			.map( stud -> stud.getAadharNo())
//			.forEach( s -> System.out.println(s));
		
		
	}

}

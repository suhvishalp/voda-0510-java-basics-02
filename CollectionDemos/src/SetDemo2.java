import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> studSet = new TreeSet<>(new StudentNameComparator());
		
		studSet.add(new Student(101, "Rohit", "3322", 40));
		studSet.add(new Student(102, "Adarsh", "6655", 70));
		studSet.add(new Student(103, "Mohit", "4432", 50));
		studSet.add(new Student(104, "Om", "6653", 74));
		studSet.add(new Student(105, "Onkar", "4577", 87));
		
		studSet.add(new Student(102, "Adarsh", "6655", 70));

		System.out.println(studSet);
		
		Student s1 = new Student(102, "Adarsh", "6655", 70);
		Student s2 = new Student(102, "Adarsh", "6655", 70);
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		
		
//		List<Student> listStud = new ArrayList<>();
//		
//		listStud.add(new Student(101, "Rohit", "3322", 40));
//		listStud.add(new Student(102, "Adarsh", "6655", 70));
//		listStud.add(new Student(103, "Mohit", "4432", 50));
//		listStud.add(new Student(104, "Om", "6653", 74));
//		listStud.add(new Student(105, "Onkar", "4577", 87));
//		
//		listStud.add(new Student(102, "Adarsh", "6655", 70));
//		
//		Comparator<Student> comparator = new StudentNameComparator();
//		Collections.sort(listStud, comparator);
//
//		System.out.println(listStud);

	}

}

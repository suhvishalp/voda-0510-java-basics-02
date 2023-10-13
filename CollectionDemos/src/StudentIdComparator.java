import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		Integer Id1 = o1.getStudId();
		Integer Id2 = o2.getStudId();
		return Id1.compareTo(Id2);
	}

	
}

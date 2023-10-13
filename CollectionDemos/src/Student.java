import java.util.Objects;

public class Student  implements Comparable<Student>{

	private int studId;
	private String name;
	private String aadharNo;
	private int marks;
	
	public Student() {
		super();
	}

	public Student(int studId, String name, String aadharNo, int marks) {
		super();
		this.studId = studId;
		this.name = name;
		this.aadharNo = aadharNo;
		this.marks = marks;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent [studId=" + studId + ", name=" + name + ", aadharNo=" + aadharNo + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(aadharNo, studId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(aadharNo, other.aadharNo) && studId == other.studId;
	}

	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		
		Integer student1Marks = this.marks;
		Integer student2Marks = other.getMarks();
		
		return student1Marks.compareTo(student2Marks);
		
//		if(this.marks > other.getMarks())
//			return 1;
//		else if (this.marks == other.getMarks())
//			return 0;
//		else 
//			return -1;
	}
	
	
	
}

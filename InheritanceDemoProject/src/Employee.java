import java.util.Objects;

public class Employee extends Person{

	@Override
	public String toString() {
		return "\nEmployee [Name=" + this.getName() + " empId=" + empId + ", salary=" + salary + "]";
	}

	private int empId;
	private double salary;
	private Address address;
	
	public Employee() {
		super();
		//System.out.println("Employee is created");
	}
	
	public Employee(String name, int age, int empId, double salary) {
		super(age, name);
		this.empId = empId;
		this.salary = salary;
		//System.out.println("Employee data is initiated");
	}
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && this.getName().equals(other.getName());
	} 
	
	
	
	
}

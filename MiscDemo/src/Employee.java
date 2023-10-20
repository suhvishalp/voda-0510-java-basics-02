import java.util.Objects;

public class Employee {
	
	private static Employee employee;
	
	private int empId;
	private String name; 
	private double salary;
	
	private Employee() {
		System.out.println("object is employee is created");
	}
	
	public static Employee getInstance() {
		if(employee ==null) {
			employee = new Employee();
			return employee;
		}else {
			System.out.println("Employee object alrady exists, returning ref to the same obj");
			return employee;
		}
		
		
	}
	
	private void somePrivateMethod() {
		System.out.println("This is private method");
	}
	
	public void show() {
		System.out.println("This is show() method of employee class");
	}

//	public Employee(int empId, String name, double salary) {
//		super();
//		this.empId = empId;
//		this.name = name;
//		this.salary = salary;
//	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, name, salary);
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
		return empId == other.empId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	} 
	
	

}

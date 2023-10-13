import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> listEmp = new ArrayList<>();
		
		listEmp.add(new Employee(101, "Rohit", 2999.00));
		listEmp.add(new Employee(102, "Mohit", 1999.00));
		listEmp.add(new Employee(101, "Rohit", 2999.00));
		listEmp.add(new Employee(103, "Adarsh", 3999.00));
		listEmp.add(new Employee(104, "Om", 5999.00));
		listEmp.add(new Employee(101, "Rohit", 2999.00));
		listEmp.add(new Employee(105, "Onkar", 4999.00));

		
		Employee empTobeDeleted = new Employee(101, "Rohit", 2999.00);
		listEmp.remove(empTobeDeleted);
		
//		int index = listEmp.indexOf(empTobeDeleted);		//contains(object)   remove(object)
//
//		System.out.println(index);
		System.out.println(listEmp);
	}

}

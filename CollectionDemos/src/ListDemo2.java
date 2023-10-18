import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

//		Comparator<Employee> empSalComparator = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				Double emp1Sal = o1.getSalary();
//				Double emp2Sal = o2.getSalary();
//				return emp1Sal.compareTo(emp2Sal);
//			}
//			
//		};
		
		Comparator<Employee> empSalComparator = (o1, o2) -> new Double(o1.getSalary()).compareTo(new Double(o2.getSalary()));
			
		
		Collections.sort(listEmp, empSalComparator);
		System.out.println(listEmp);

		
		
//		Employee empTobeDeleted = new Employee(101, "Rohit", 2999.00);
//		listEmp.remove(empTobeDeleted);
//		
//		int index = listEmp.indexOf(empTobeDeleted);		//contains(object)   remove(object)
//
//		System.out.println(index);
//		System.out.println(listEmp);
	}

}

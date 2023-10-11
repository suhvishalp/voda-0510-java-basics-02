import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		
//		System.out.println(list);
		
		
		ArrayList<Employee> listEmp = new ArrayList<>();
		Employee emp1 = new Employee("Rohit", 20, 101, 3000.00);
		listEmp.add(emp1);

		listEmp.add(new Employee("Mohit", 21, 102, 4000.00));
		
		listEmp.add(new Employee("Skanda", 21, 104, 4000.00));
		
		listEmp.add(new Employee("Pranjal", 22, 104, 5000.00));
		
		listEmp.add(new Employee("Adarsh", 20, 105, 2000.00));
		
		Employee employee = new Employee("Adarsh", 20, 102, 2000.00);
		
		if(listEmp.contains(employee))
			System.out.println("Given emp found in the list");
		else 
			System.out.println("Not found");
	
	
		//System.out.println(listEmp);
	}
	
	

}

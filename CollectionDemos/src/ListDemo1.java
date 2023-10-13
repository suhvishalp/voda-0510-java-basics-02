import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		
		List<String> names = new LinkedList<>();
		
		List<Date> birthDays = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.addAll(Arrays.asList(32,45,34));
		
		//list.add(20, 44);
		
		list.add(3, 333);
		
		 
//		Iterator<Integer> myIterator = list.iterator();
//		
//		ListIterator<Integer> myListIterator =  list.listIterator();
//		
//		System.out.println(myListIterator.next());
//		System.out.println(myListIterator.next());
//		System.out.println(myListIterator.next());
//		System.out.println(myListIterator.next());
//		System.out.println(myListIterator.previous());
//		System.out.println(myListIterator.previous());
//
//		System.out.println(myListIterator.previous());

		
//		while(myIterator.hasNext()) {
//			int value  = myIterator.next();
//			System.out.println(value);
//		}
		
	}

}

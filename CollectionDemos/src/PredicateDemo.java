import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numsArr = {23,54,3,6,45,2,31,7,9,35, 75, 5,2,54,56,34,2,11,33};
		
		
		Predicate<Integer> evenNumPredicate =  n -> n % 2 == 0;
		Predicate<Integer> oddNumPredicate =  n -> n % 2 == 1;	
		Predicate<Integer> numPredicate1 = n -> n > 30;	
		
		
		Predicate<Integer> combinedPredicate = evenNumPredicate.and(numPredicate1);
			
		
		//show all even numbers
//		show(numsArr, evenNumPredicate);
		
		
		//show all odd numbers
//		show(numsArr, oddNumPredicate);
		
		//show all numbers greater than 30
//		show(numsArr,numPredicate1);
		
		//show all even numbers greater than 30
		show(numsArr, combinedPredicate);
		
		
		//show all numbers less than 30
		
		
		//show all odd numbers greater than 40
		
		
		

	}
	
	public static void show(int[] arr, Predicate<Integer> predicate) {
		
		for(int value : arr) {
			if(predicate.test(value))
				System.out.println(value);
		}
	}

}

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
	
	public static void main(String[] args) {
		
		Set<Integer> numsSet = new TreeSet<>();

	
		numsSet.add(62);
		numsSet.add(34);
		numsSet.add(20);
		numsSet.add(23);
		
		numsSet.add(10);
		numsSet.add(30);
		numsSet.add(32);
		
		numsSet.add(42);
		numsSet.add(52);
		
		
		System.out.println(numsSet);
	
	}

}

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] names = {"aaa","bbb","ccc"};
//		Consumer<String> consumer = (String t) -> System.out.println(t); 
//		
//		for(String name : names) {
//			consumer.accept(name);
//		}
		
//		Supplier<Integer> supplier = () -> (int)(Math.random()*100);
//		
//		System.out.println(supplier.get());
//		System.out.println(supplier.get());
//
//		System.out.println(supplier.get());
//
//		System.out.println(supplier.get());
//
//		System.out.println(supplier.get());
//
//		System.out.println(supplier.get());
//
//		System.out.println(supplier.get());
//
//		System.out.println(supplier.get());
		
		Function<String, Integer> function = (String str) -> str.length(); 
		System.out.println(function.apply("Welcome"));

		
	}

}

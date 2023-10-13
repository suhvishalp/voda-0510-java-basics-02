import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101,  "Rohit");
		map.put(102,  "Mohit");
		map.put(103,  "Adarsh");
		map.put(104,  "Om");
		map.put(105,  "Onkar");
		
		
//		Collection<String> collection = map.values();
//		for(String value : collection) {
//			System.out.println(value);
//		}
		
//		Set<Integer> keys = map.keySet();
//		
//		for(Integer item : keys) {
//			String value =  map.get(item);
//			System.out.println(value);
//		}

		
		Set<Map.Entry<Integer, String>> entrySet =  map.entrySet();
		
		for(Map.Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("Key : " + key + " Value : " + value);
		}
		
	}

}

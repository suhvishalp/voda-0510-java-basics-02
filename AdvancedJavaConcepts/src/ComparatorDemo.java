import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TreeSet<String> treeSet = new TreeSet<>(new StringLengthComparator());


		//annoymous object
		Comparator<String> stringLengthComparator = new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				int len1 = str1.length();
				int len2 = str2.length();
		
				if (len1 < len2) {
					return -1;
				} else if (len1 > len2) {
					return 1;
				} else {
		
					return str1.compareTo(str2);
				}
			}
			
		};	
		
		TreeSet<String> treeSet = new TreeSet<>(stringLengthComparator);
		


		
		treeSet.add("om");
		treeSet.add("omkar");
		treeSet.add("rohit");
		treeSet.add("pranjal");
		treeSet.add("yashasvi");

		for (String str : treeSet) {
			System.out.println(str);
		}
	}

}

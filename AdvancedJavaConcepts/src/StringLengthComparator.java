import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

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
}

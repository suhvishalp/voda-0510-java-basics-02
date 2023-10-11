import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mobileNumber = "9234567898";
		String password = "sdfsdf";
		
		
		
		boolean result = Pattern.matches("[7-9][0-9]{9}", mobileNumber);
		System.out.println(result);
	}

}

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		int[] arr = {1,2,3,4,5};
//		
//		System.out.println(arr[6]);
		
		

		Scanner scanner  = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Enter number1 : ");
			int num1 = scanner.nextInt();
			
			System.out.println("Enter number2 : ");
			int num2 = scanner.nextInt();
		
			int result = num1 / num2;
			System.out.println(result);
			
			
			System.out.println("Enter Age: ");
			int age = scanner.nextInt();			//-21
			
			if(age>0 && age<100) {
				System.out.println("age  : " + age);
			}else {
				throw new Exception("Age is invalid");
			}
			
		}catch(ArithmeticException ex) {
			System.out.println("invalid second number: cannot be 0, please try again");
			System.out.println(ex.getMessage());
			System.out.println();
			ex.printStackTrace();
		}
//		catch(InputMismatchException ex) {
//			System.out.println("The input is invalid");
//			System.out.println();
//			ex.printStackTrace();
//		}
//		catch(Exception ex) {
//			System.out.println(ex.getMessage());
//		}
		
		System.out.println("end of program");
		
	}

}

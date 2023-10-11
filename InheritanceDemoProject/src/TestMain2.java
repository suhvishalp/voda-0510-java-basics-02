import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape = null; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Choice: \n\t 1. Rectangle \n\t 2. Circle ");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			shape = new Rectangle(2.00, 5.22);
			break;
			
		case 2:
			shape = new Circle(4.32);
			break;
			
		default:
			System.out.println("try again!");
		}
		
		if(shape!=null)
			shape.calcArea();
		
	}

}



public class ExceptionDemo2 {

	
	public static void method1() throws Exception {
		
		int a = 10;
		if(a<=10) {
			throw new Exception();
		}
	}
	
	public static void method2() throws Exception {
		method1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

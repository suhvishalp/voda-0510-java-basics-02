import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		
		Class ref = Class.forName("Employee");
		
		Method showMethodRef =  ref.getMethod("show", null);
		
		Employee obj = (Employee)ref.newInstance();
		
		showMethodRef.invoke(obj, null);
		
//		Method[] methods = ref.getDeclaredMethods();
//		
//		for(Method m : methods) {
//			System.out.println(m.getName());
//		}
	 
		
	}

}

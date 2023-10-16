
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("This is main method");
		
		MyThread thread1 = new MyThread("T1");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		
		MyThread thread2 = new MyThread("T2");
		thread2.start();
	
		//code that executes a task
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " : i = " + i);
			Thread.sleep(2000);
		}
	
		
		thread1.join();
		thread2.join();
	
		System.out.println("Main Method Ends Here!");
	}

}

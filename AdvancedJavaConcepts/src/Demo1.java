
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("This is main method");
		
		MyThread thread1 = new MyThread("T1");
		System.out.println("T1 state = " + thread1.getState());
//		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		
		
		System.out.println("after T1.start() state = " + thread1.getState());
		
		Thread.sleep(5000);
		
		System.out.println("after inside run() method, while the thread is sleeping: state = " + thread1.getState());

		
		MyThread thread2 = new MyThread("T2");
		System.out.println("T2 state = " + thread2.getState());

//		thread2.start();
	
		//code that executes a task
//		for(int i=1; i<=10; i++) {
//			System.out.println(Thread.currentThread().getName() + " : i = " + i);
//			Thread.sleep(2000);
//		}
	
		
		thread1.join();
		thread2.join();
	
		System.out.println("Main Method Ends Here!");
	}

}


public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Runnable task1 = new MyTask();
		
		Thread t1 = new Thread(task1);
		t1.start();
		
		Thread t2 = new Thread(task1);
		t2.start();

		Thread.sleep(8000);
		t1.interrupt();
		
	}

}

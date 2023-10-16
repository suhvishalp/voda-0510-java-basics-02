
public class MyThread extends Thread{
	
	
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		
		System.out.println("This is " + Thread.currentThread().getName() + " , and its started the execution");
		
		for(int j=1; j<=10; j++) {
			System.out.println("\n\t" + Thread.currentThread().getName() + " : j = " + j);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println( Thread.currentThread().getName() + " Finished!");
	}
	 
}

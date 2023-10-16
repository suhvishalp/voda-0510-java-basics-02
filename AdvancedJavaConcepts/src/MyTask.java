
public class MyTask implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread : " + Thread.currentThread().getName() + " Started");
		
		for(int i=1; i<=10; i++) {
			System.out.println("\t" + Thread.currentThread().getName() +" : i = " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(Thread.currentThread().getName() + " got interrupted");
			}
		}
		
		
		System.out.println("Thread : " + Thread.currentThread().getName() + " Ended");

	}

	
}

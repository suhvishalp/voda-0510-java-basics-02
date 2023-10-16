import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
		
//		Runnable task = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("Helloworld!, this is a runnable task");
//			}
//		};
		
		Runnable task = () -> System.out.println("Helloworld!, this is a runnable task");
		
		//scheduler.schedule(task, 5, TimeUnit.SECONDS);
		scheduler.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
	}

}

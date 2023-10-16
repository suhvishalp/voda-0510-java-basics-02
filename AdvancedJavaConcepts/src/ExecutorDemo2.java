import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		FactorialCalculator calc1 = new FactorialCalculator(5);
		
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		Future<Integer> futFactValue =  pool.submit(calc1);
		System.out.println(futFactValue.get());
		
		Thread.sleep(3000);
		
		if (futFactValue.isDone())
			System.out.println("Yes the task is completed, fact value is calculated");
		else 
			System.out.println("still waiting");

	}

}

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {

	private int n;

	public FactorialCalculator(int n) {
		super();
		this.n = n;		//5 = 5x4x3x2x1
	} 
	
	
	public Integer call() throws InterruptedException {
		
		//return fact value of n
		//
		int result = 1;
		
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		
		Thread.sleep(10000);
		
		return result;
	}
}

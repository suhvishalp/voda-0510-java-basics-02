
public class SyncDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank();			//10 accounts - total bal - 1000.00
		
		for(int i=1; i<10; i++ ) {
			
			Thread thread = new Thread(new Transaction(bank, i));
			thread.start();
			
		}

	}

}


public class Transaction implements Runnable {
	
	private Bank bank;
	private int fromAccount;
	private int toAccount;
	
	public Transaction(Bank bank, int from) {
		this.bank = bank;
		this.fromAccount = from;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			
			int toAccount = (int) (Math.random() * Bank.MAX_ACCOUNT);

            if (toAccount == fromAccount) continue;

            int amount = (int) (Math.random() * Bank.MAX_AMOUNT);

            if (amount == 0) continue;

            bank.transfer(fromAccount, toAccount, amount);

            try {

                  Thread.sleep(3000);

            } catch (InterruptedException e) {

                  e.printStackTrace();

            }
		}
	}
	
	 

	

}

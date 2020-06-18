
public class BankingApp implements Observer  {

	private Subject subject;
	
	public void setBankBalance(double accountBalance) {
		System.out.println("---BankingApp---");
		System.out.println("Your current account balance is " + accountBalance + " $");
	}
	
	@Override
	public void update() {
		this.setBankBalance(((BankAccount) subject).getAccountBalance());
		
	}

	public BankingApp(Subject subject) {
		this.subject = subject;
		
	}
}

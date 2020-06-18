
public class Client {

	public static void main(String[] args) {
		
		
		
		BankAccount bankaccount = new BankAccount();
		
		
		
		Observer atm = new ATM(bankaccount);
		Observer bankingApp = new BankingApp(bankaccount);
		Observer onlineBanking = new OnlineBanking(bankaccount);
		
//		ProductFactory pf = new ProductFactory();
//		
//		Observer atm = pf.createProduct("ATM", bankaccount);
//		Observer bankingApp = pf.createProduct("BankingApp",bankaccount);
//		Observer onlineBanking = pf.createProduct("OnlineBanking",bankaccount);
		
		
		
		bankaccount.attach(atm);
		bankaccount.attach(bankingApp);
		bankaccount.attach(onlineBanking);
		bankaccount.setState(20);
		
		bankaccount.detach(atm);
		
		bankaccount.setState(5000);
		

		

	}

}

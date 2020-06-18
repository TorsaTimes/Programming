
public class ProductFactory {

	
	public Observer createProduct(String p, BankAccount b){
		
		
		
		if(p.equals("ATM")) {
			return new ATM(b);
		}
		
		else if(p.equals("BankingApp")) {
			return new BankingApp(b);
		}
		else if(p.equals("OnlineBanking")) { 
			Observer ob = new OnlineBanking(b);
			return ob;
		}
		return null;
		
	}
	
	
}

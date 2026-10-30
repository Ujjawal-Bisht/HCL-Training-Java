package Day05;

public class googlePay extends BankAccount{

	googlePay(int bal) {
		super(bal);
	}
	
	public int checkBal() {
		return super.checkBal() ;
	}
	
	public void pay(int n) {	
		if(n > checkBal()) {
			System.out.println("Insufficient Balance!!!");
		}
		super.setBal(checkBal() - n );
		System.out.println("Updated Balance: "+checkBal());

		
	}
	public static void main(String[] args) {
		System.out.println("Hello") ;
	}

}

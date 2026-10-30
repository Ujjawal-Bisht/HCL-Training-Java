package Day05;

public class BankAccount {
	private int bal ;
	
	
	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	BankAccount(int bal){
		this.bal = bal ;
	}
	
	public int checkBal() {
		return getBal() ;
	}
	
	public void withdraw(int cash) {
		if(cash <= 0) System.out.println("Please enter vaild amount.");
		if(cash > getBal()) {
			System.out.println("Insufficient Balance!!!");
		}
		
		System.out.println(cash + "Rs. withdrawn from your account.");
		setBal(getBal() - cash);
		
		System.out.println("Updated Balance: "+getBal());
	}
	
	public void deposit(int amt) {
		if(amt <= 0) System.out.println("Please enter vaild amount.");
		setBal(getBal() + amt);
		System.out.println("Updated Balance: "+getBal());
	}
	
}

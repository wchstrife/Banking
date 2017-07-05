package bank;

public class Account {

	private double balance;

	public Account(double init_balance) {
		super();
		this.balance = init_balance;
	}

	public double getBalance() {
		return balance;
	}

	/*
	 * ´æ¿î
	 */
	public boolean deposit(double amt){
		this.balance += amt;
		
		return true;
	}
	
	/*
	 * È¡¿î
	 */
	public boolean withdraw(double amt){
		if(amt > this.getBalance()){
			
			return false;
		}else{
		this.balance -= amt;
		
		return true;
		}
	}
	
	
}

package bank;

public class Account {

	protected double balance;

	public Account(double init_balance) {
		this.balance = init_balance;
	}

	public double getBalance() {
		return balance;
	}

	/*
	 * 存款
	 */
	public boolean deposit(double amt){
		this.balance += amt;
		
		return true;
	}
	
	/*
	 * 取款
	 */
	public void withdraw(double amt){
		
		if(amt > this.getBalance()){			
			throw new OverdraftException("资金不足", amt - balance);
		}
		
		this.balance -= amt;				
		
	}
	
	
}

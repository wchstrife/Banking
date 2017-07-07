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
	 * ���
	 */
	public boolean deposit(double amt){
		this.balance += amt;
		
		return true;
	}
	
	/*
	 * ȡ��
	 */
	public void withdraw(double amt){
		
		if(amt > this.getBalance()){			
			throw new OverdraftException("�ʽ���", amt - balance);
		}
		
		this.balance -= amt;				
		
	}
	
	
}

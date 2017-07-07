package bank;
/*
@author wchstrife
@version 2017年7月6日下午1:36:21
*/

public class CheckingAccount extends Account{
	
	private Double overdraftProtection;
	
	public CheckingAccount(double init_balance) {
		super(init_balance);
	}
	
	public CheckingAccount(double init_balance, double protect) {
		super(init_balance);
		this.overdraftProtection = protect;
	}
	
	@Override
	public void withdraw(double amt) {
		if(balance > amt){
			balance -= amt;		
		}else{ 
			if(overdraftProtection == null){
				throw new OverdraftException("no overdraft protection", (amt - balance));
			}
			if (overdraftProtection >= (amt - balance)) {
				overdraftProtection -= (amt - balance);
				balance = 0;
			}else {
				throw new OverdraftException("Insufficient funds for overdraft protection", (amt - balance));
		}	
		
	}		
}
}
package bank;
/*
@author wchstrife
@version 2017��7��6������1:27:56
*/
public class SavingAccount extends Account{
	
	double interestRate;
	
	public SavingAccount(double balance, double interest_rate) {
		super(balance);
		this.interestRate = interest_rate;
	}		
}

package bank;
/*
@author wchstrife
@version 2017年7月7日下午1:33:25
*/
public class CustomerReport {
	
	public void generateReport() {
		
		Bank bank = new Bank().getBank();
		
		Customer customer = null;
		
		System.out.println("\t\t\tCUSTOMERS REPORT");
		System.out.println("\t\t\t================");
		
		for (int cust_idx = 0; cust_idx < bank.getNumberOfCustomers(); cust_idx++) {
			customer = bank.getCustomer(cust_idx);

			System.out.println();
			System.out.println("Customer: " + customer.getLastName() + ", "
					+ customer.getFirstName());

			for (int acct_idx = 0; acct_idx < customer.getnumberOfAccounts(); acct_idx++) {
				Account account = customer.getAccount(acct_idx);
				
				String account_type = "";

				
				if (account instanceof SavingAccount) {
					account_type = "Savings Account";
				} else if (account instanceof CheckingAccount) {
					account_type = "Checking Account";
				}

				
				System.out.println(account_type + ": current balance is ��"
						+ account.getBalance());
			}
		}
	}
}

package bank;

import javax.print.attribute.standard.NumberOfDocuments;

public class Bank {
	
	Customer[] customers;
	
	int numberOfCustomers = 0;

	public Bank() {
		customers = new Customer[5];
	}
	
	public void addCustomer(String firstName, String lastName){
		Customer co = new Customer(firstName, lastName);
		customers[numberOfCustomers] = co;
		numberOfCustomers++;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer getCustomers(int index) {
		return customers[index];
	}

	

	
}

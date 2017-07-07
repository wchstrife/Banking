package bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	
	private List<Customer> customers;	

	public Bank() {
		customers = new ArrayList<Customer>();
	}
	
	private static Bank instance = new Bank();
	
	public static Bank getBank() {
		
		return instance;
	}
	
	public void addCustomer(String firstName, String lastName){
		Customer co = new Customer(firstName, lastName);
		customers.add(co);
	}

	public int getNumberOfCustomers() {
		
		return customers.size();
	}

	public Customer getCustomer(int index) {
		
		return customers.get(index);
	}
	
	public Iterator<Customer> getCustomers(){
		return customers.iterator();
	}	
}

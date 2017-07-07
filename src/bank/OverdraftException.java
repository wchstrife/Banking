package bank;
/*
@author wchstrife
@version 2017��7��7������1:53:08
*/
public class OverdraftException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private double deficit;
	
	public double getDeficit() {
		return deficit;
	}
	
	public OverdraftException(String message, double deficit) {
		super(message);
		this.deficit = deficit;
	}
}

package cse360assign2;
/*
 * This class act as a calculator. Stores the history of all operations as well a 
 * the running total.
 */
public class Calculator {

	/**
	 * The running total of all operations
	 */
	private int total;
	
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	/**
	 * Returns the total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * 
	 * Adds the integer passed as a parameter to the runnning total
	 * Adds the operation to the end of operations
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	/**
	 * Subtracts the integer passed as a parameter to the running total
	 * Adds the operation to the history of operations
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	/**
	 * Multiplies the running total by the integer passed as a parameter
	 * Adds the operation to the history of operations
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	/**
	 * Divides the running total by the integer passed as a parameter
	 * If the passed value is 0, sets total to 0
	 */
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
			
		}
		else 
		{
			total /= value;
			
		}
		history += " / " + value;
	}
	/**
	 * Returns the full expression, including all operations.
	 * 
	 */
	public String getHistory () {
		return history + " = " + total;
	}
}
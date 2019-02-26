package cse360assign2;
/*
 * This class act as a calculator. Stores the history of all operations as well a 
 * the running total.
 */
public class Calculator {

	/*
	 * The running total of all operations
	 */
	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/*
	 * Returns the result of all operations. Only returns 0 for now
	 */
	public int getTotal () {
		return 0;
	}
	/*
	 * Adds the integer passed as a parameter to the runnning total
	 * Currently not functional.
	 */
	public void add (int value) {
		
	}
	/*
	 * Subtracts the integer passed as a parameter to the running total
	 * Currently not function
	 */
	public void subtract (int value) {
		
	}
	/*
	 * Multiplies the running total by the integer passed as a parameter
	 * Currently not functional
	 */
	public void multiply (int value) {
		
	}
	/*
	 * Divides the running total by the integer passed as a parameter
	 * Currently not functional
	 */
	public void divide (int value) {
		
	}
	/*
	 * Returns the full expression, including all operations.
	 * Currently not functional
	 */
	public String getHistory () {
		return "";
	}
}
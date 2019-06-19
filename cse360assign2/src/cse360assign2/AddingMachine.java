/**Assignment #: 2
* @author Hang Zheng	
* Lecture: T/Th 11:00
* this class create and calculate the total value
* of the machine.
*/

package cse360assign2;

public class AddingMachine {
	/**
	 * initialize total and history of transactions 
	 * @param total   integer of total number 
	 * @param history string history of transactions
	 */
	private int total;
	private String history = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * this method return the calculated total number 
	 * @return return the total integer
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * this method add the value to total 
	 * and record the transactions in history
	 * @param value the integer value input
	 */
	public void add (int value) {
		total = total + value;
		history = history +" + "+ Integer.toString(value);
	}
	/**
	 * this method subtract the value to total 
	 * and record the transactions in history
	 * @param value the integer value input
	 */
	public void subtract (int value) {
		total = total - value;
		history = history +" - "+ Integer.toString(value);
	}
	/**
	 * 	this method return the string of transactions
	 * @return return the history string
	 */
	public String toString () {
		return history;
	}
	
	public void clear() {
	
	}
}



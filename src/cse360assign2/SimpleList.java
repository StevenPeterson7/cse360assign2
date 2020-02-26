/* *
 * @author Steven Peterson
 * @id 415
 * @assignment 1
 * SimpleList class that implements a list and count. Users can add, remove or 
 * search integers in the list, count the number of elements in the list or 
 * return the contents of the list
 */

package cse360assign2;

/**
 * 
 * SimpleList has two private variables: an array of integers, list, and an 
 * integer, count. SimpleList has a constructor, SimpleList that sets count 
 * to 0 and list to an array of 10 elements.
 * @author Steven Peterson
 *
 */
public class SimpleList {
	
	/**
	 * list[] - integer array of elements
	 * count - integer of number of elements
	 */
	private int list[];
	private int count;
	
	/**
	 * Constructs and initializes a list with 10 empty slots
	 */
	
	public SimpleList() {
		count = 0;
		list = new int[10];
	}
	
	/**
	 * Adds a new integer to the list and increments the count.
	 * 
	 * @param add 
	 * integer to add to the list
	 */
	
	public void addInt(int add) {
		//shift elements to the right
		for(int i = 9; i > 0; i--) {
			list[i] = list[i-1];
		}
		list[0] = add;
		if(count < 10) {
			count = count + 1;
		}
		
	}
	
	/**
	 * Remove a specified integer from the list and decrement the count.
	 * 
	 * @param remove
	 * integer to be removed from the list
	 */
	
	public void remove(int remove) {
		int index = search(remove);
		
		if(index != -1) {
			//shift elements to the left
			for(int i = index; i < 9; i++) {
				list[i] = list[i+1];
			}
			list[9] = 0;
			count = count-1;
		}
		
		
	}
	
	/**
	 * Return the number of integers saved in the list
	 * @return
	 * count of integers
	 */
	
	public int count() {
		return count;		
	}
	
	/**
	 * Return the content of the list as a string delimited by spaces.
	 * 
	 * @return
	 * string of content
	 */
	public String toString() {
		String output = "";
		for(int i = 0; i < count; i++) {
			output = output + Integer.toString(list[i]) + " "; 
		}
		output = output.substring(0, output.length()-1);
		return output;
	}
	
	/**
	 * Returns index of integer value in list
	 * 
	 * @param value
	 * integer to be searched for
	 * 
	 * @return
	 * index of integer
	 */
	
	public int search(int value) {
		for(int i = 0; i < 10; i++) {
			if(list[i]==value) {
				return i;
			}
		}
		return -1;
	}
	
}

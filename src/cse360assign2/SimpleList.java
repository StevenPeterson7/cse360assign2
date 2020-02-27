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
	 * Add a new integer to the list, increment the count and extend 
	 * the list if necessary.
	 * 
	 * @param add
	 * integer to be added to the list
	 */
		
	void add(int add) {
		
		if (count == list.length - 1) {
			//create list of new length to hold more integers
			int[] temp_list = new int [(int) (list.length*1.5)];
			for(int index = 0; index < list.length; index++) {
				temp_list[index] = list[index];
			}
			list = temp_list;
			
		}
		
		for(int i = list.length -1; i > 0; i--) {
			list[i] = list[i-1];
		}
		list[0] = add;
		count ++;
	}
		
	
	
	/**
	 * Remove a specified integer from the list and decrement the count.
	 * Reduce the size of the list if appropriate
	 * 
	 * @param remove
	 * integer to be removed from the list
	 */
	
	public void remove(int remove) {
		int index = search(remove);
		
		if(index != -1) {
			//shift elements to the left
			for(int i = index; i < list.length-1; i++) {
				list[i] = list[i+1];
			}
			list[list.length -1] = 0;
			count = count-1;
		}
		if (count < (int) (list.length*0.75) ) {
			//create list of new length to hold more integers
			int[] temp_list = new int [count + 1];
			for(int l_index = 0; l_index < count; l_index++) {
				temp_list[l_index] = list[l_index];
			}
			list = temp_list;
			
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
		for(int i = 0; i < list.length; i++) {
			if(list[i]==value) {
				return i;
			}
		}
		return -1;
	}
	
	
	/**
	 * Appends value to the end of the list, increments the count and 
	 * resizes the list if necessary.
	 * 
	 * @param append
	 * value to be appended
	 */
	public void append(int append) {
		if (count == list.length - 1) {
			//create list of new length to hold more integers
			int[] temp_list = new int [(int) (list.length*1.5)];
			for(int index = 0; index < list.length; index++) {
				temp_list[index] = list[index];
			}
			list = temp_list;
			
		}
		list[count] = append;
		count ++;
		
	}
	
	/**
	 * Returns the first value of the list.
	 * Returns -1 if there are no values.
	 */
	public int first() {
		if(count == 0) {
			return -1;
		}else {
			return list[0];
		}
		
	}
	
	/**
	 * Returns the last value of the list.
	 * Returns -1 if there are no values.
	 */
	public int last() {
		if(count == 0) {
			return -1;
		}else {
			return list[count -1];
		}
		
	}
	
	/**
	 * Returns the number of possible entries in the list.
	 * Returns -1 if there are no values.
	 */
	public int size() {
		return list.length;
		
	}
	
	
	
	
}

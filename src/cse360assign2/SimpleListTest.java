/** 
 * @author Steven Peterson
 * @assignment 1
 * Test methods for SimpleList Class
 * every method in SimpleList is has two associated test methods here
 */
package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * junit tests for SimpleList class
 * @author steven peterson
 *
 */

public class SimpleListTest {

	@Test
	/**
	 * success case test for constructor
	 */
	public void test_SimpleList() {
		SimpleList l = new SimpleList();
		assertNotNull(l);
	}
	
	/**
	 * failure case test for constructor
	 */
	@Test
	public void test_SimpleList2() {
		SimpleList l = null;
		assertNull(l);
	}
	
	/**
	 * success case test for addInt()
	 */
	@Test
	public void test_addInt() {
		SimpleList l = new SimpleList();
		l.add(1);
		assertEquals(l.toString(), "1");
	}
	
	/**
	 * failure case test for addInt()
	 */
	@Test
	public void test_addInt2() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		assertNotEquals(l.toString(), "1");
	}
	/**
	 * second success case test for addInt()
	 */
	@Test
	public void test_addInt3() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(11);
		l.add(12);
		assertEquals(l.toString(), "12 11 10 9 8 7 6 5 4 3 2 1");
	}
	/**
	 * success case test for remove()
	 */
	@Test
	public void test_remove() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.remove(2);
		assertEquals(l.toString(), "3 1");
	}
	
	/**
	 * failure case test for remove()
	 */
	@Test
	public void test_remove2() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.remove(1);
		assertNotEquals(l.toString(), "3 2 1");
	}
	
	/**
	 * second success case test for remove()
	 */
	@Test
	public void test_remove3() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(11);
		l.add(12);
		l.remove(1);
		l.remove(5);
		l.remove(8);
		l.remove(9);
		l.remove(11);
		l.remove(2);
		assertEquals(l.toString(), "12 10 7 6 4 3");
	}
	
	/**
	 * success case test for count()
	 */
	@Test
	public void test_count() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		assertEquals(l.count(), 3);
	}
	
	/**
	 * failure case test for count()
	 */
	@Test
	public void test_count2() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		assertNotEquals(l.count(), 3);
	}
	
	/**
	 * success case test for toString()
	 */
	@Test
	public void test_toString() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		assertEquals(l.toString(), "3 2 1");
	}
	
	/**
	 * failure case test for toString()
	 */
	@Test
	public void test_toString2() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		assertNotEquals(l.toString(), "3 1");
	}
	
	/**
	 * success case test for search()
	 */
	@Test
	public void test_search() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		assertEquals(l.search(2), 1);
	}
	
	/**
	 * failure case test for search()
	 */
	@Test
	public void test_search2() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		assertNotEquals(l.search(1), 1);
	}

}
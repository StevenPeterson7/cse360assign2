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
	
	/**
	 * success case test for append()
	 */
	@Test
	public void test_append() {
		SimpleList l = new SimpleList();
		l.append(1);
		l.append(2);
		l.append(3);
		assertEquals(l.toString(), "1 2 3");
	}
	
	/**
	 * second success case test for append()
	 */
	@Test
	public void test_append2() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.append(3);
		l.add(2);
		assertEquals(l.toString(), "2 1 3");
	}
	
	/**
	 * failure case test for append()
	 */
	@Test
	public void test_append3() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.append(3);
		l.append(2);
		assertNotEquals(l.toString(), "1 2 3");
	}
	
	/**
	 * success case test for first()
	 */
	@Test
	public void test_first() {
		SimpleList l = new SimpleList();
		l.append(1);
		l.append(2);
		l.append(3);
		assertEquals(l.first(), 1);
	}
	
	/**
	 * second success case test for first()
	 */
	@Test
	public void test_first2() {
		SimpleList l = new SimpleList();
		assertEquals(l.first(), -1);
	}
	
	/**
	 * failure case test for first()
	 */
	@Test
	public void test_first3() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.append(3);
		l.append(2);
		assertNotEquals(l.first(), 2);
	}
	
	/**
	 * success case test for last()
	 */
	@Test
	public void test_last() {
		SimpleList l = new SimpleList();
		l.append(1);
		l.append(2);
		l.append(3);
		assertEquals(l.last(), 3);
	}
	
	/**
	 * second success case test for last()
	 */
	@Test
	public void test_last2() {
		SimpleList l = new SimpleList();
		assertEquals(l.last(), -1);
	}
	
	/**
	 * failure case test for last()
	 */
	@Test
	public void test_last3() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.append(3);
		l.append(2);
		assertNotEquals(l.last(), 1);
	}
	
	
	/**
	 * success case test for size()
	 */
	@Test
	public void test_size() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		assertEquals(l.size(), 10);
	}
	
	/**
	 * second success case test for size()
	 */
	@Test
	public void test_size2() {
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
		assertEquals(l.size(), 15);
	}
	/**
	 * third success case test for size()
	 */
	@Test
	public void test_size3() {
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
		l.remove(12);
		l.remove(11);
		l.remove(10);
		l.remove(9);
		l.remove(8);
		l.remove(7);
		assertEquals(l.size(), 8);
	}

}
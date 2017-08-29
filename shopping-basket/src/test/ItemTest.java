package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import shopping.Item;

/**
 * Test Item 
 * class functions. 
 * @author alabsi
 *
 */
public class ItemTest {
	
	private Item item; 
	
	@Before
	public void setup() {
		
		item = new Item();
	}
	
	@Test
	public void testSetGetItemId() {
		
		int expected = 1;
		item.setItemId(expected);
		int actual = item.getItemId();
		assertEquals(expected, actual);	
	}
	
	@Test
	public void testSetGetName(){
		
		String expected = "Bread";
		item.setName(expected);
		String actual = item.getName();
		assertEquals(expected, actual);	
	}
	
	@Test
	public void testSetGetPrice(){
		
		BigDecimal expected = new BigDecimal(5.20).setScale(2, BigDecimal.ROUND_HALF_UP);
		item.setPrice(expected);
		BigDecimal actual = item.getPrice();
		assertEquals(expected, actual);	
	}
}

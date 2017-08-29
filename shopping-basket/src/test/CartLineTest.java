package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import shopping.CartLine;
import shopping.Item;

/**
 * Test CartLine
 * class functions.
 * @author alabsi
 *
 */
public class CartLineTest {
	
	/*
	 * CartLine attribute cart to call the 
	 * cartline
	 */
	private CartLine cartline;
	
	@Before
	public void setup() {
		
		cartline = new CartLine(new Item());
		
	}
	
	/**
	 * Test Set and Get functions
	 * for Item Quantity. 
	 */
	@Test
	public void testSetGetItemQuantity(){
		int expected = 1;
		cartline.setItemQuantity(expected);
		int actual = cartline.getItemQuantity();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Test IncrementQuantity
	 * function. 
	 */
	@Test
	public void testIncrementQuantity(){
		int expected = 3;
		cartline.incrementQuantity();
		cartline.incrementQuantity();
		assertEquals(expected, cartline.getItemQuantity());	
	}
}

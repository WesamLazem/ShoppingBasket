package test;



import java.math.BigDecimal;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import shopping.ShoppingCart;
import shopping.CartLine;

/**
 * class to Test the Shopping Cart class
 * functions.
 * @author alabsi
 *
 */
public class ShoppingCartTest {
	
	/*
	 * ShoppingCart attribute cart to call the 
	 * shoppingCart. 
	 */
	private ShoppingCart cart;
	
	@Before
	public void setup() {
		cart = new ShoppingCart();
	
	}
	/**
	 * Test the AddItemToCartByItem
	 * function. 
	 */
	@Test 
	public void testAddItemToCartByItem(){

		cart.addItemToCartByItem(1);
		cart.addItemToCartByItem(2);
		cart.addItemToCartByItem(1);
		CartLine cartLineOne = cart.getCartLines().get(0);
		CartLine cartLineTwo = cart.getCartLines().get(1);
	
		Assert.assertEquals(2, cart.getItemCount());
		
		Assert.assertEquals(1, cartLineOne.getItem().getItemId());
		Assert.assertEquals(2, cartLineOne.getItemQuantity());

		Assert.assertEquals(2, cartLineTwo.getItem().getItemId());
		Assert.assertEquals(1, cartLineTwo.getItemQuantity());
		
	}
	
	/**
	 * Test the GetTotalCost
	 * function.  
	 */
	@Test
	public void testGetTotalCost(){

		cart.addItemToCartByItem(1);
		cart.addItemToCartByItem(2);
		cart.addItemToCartByItem(1);
		Assert.assertEquals(new BigDecimal(5.20).setScale(2, BigDecimal.ROUND_HALF_UP),cart.getTotalCost());
	}
	
	/**
	 * Test PrintCartItems
	 * function
	 */
	@Test
	public void testPrintCartItems(){

		cart.addItemToCartByItem(1);
		cart.addItemToCartByItem(2);
		cart.addItemToCartByItem(1);
		
		String expectedOuput = "Item Name: Bread\nItem Cost: 0.40\nItem Quantity:2\nItem Name: Meat\nItem Cost: 4.40\nItem Quantity:1\nTotal: 5.20";
		
		Assert.assertEquals(expectedOuput,cart.printCartItems());
		
	}

}

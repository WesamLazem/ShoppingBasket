package shopping;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
	
		ShoppingCart cart = new ShoppingCart();
		cart.addItemToCartByItem(1);
		cart.addItemToCartByItem(2);
		cart.addItemToCartByItem(1);
		System.out.println(cart.printCartItems());

	}

}

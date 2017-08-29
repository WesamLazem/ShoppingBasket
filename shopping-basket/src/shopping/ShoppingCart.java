package shopping;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ShoppingCart class to 
 * Create  Shopping Cart objects.
 * @author alabsi
 *
 */
public class ShoppingCart {
	
	/*
	 * ShoppingCart Attributes 
	 * has CartLine
	 * and Item types. 
	 */
	private List<CartLine> cartLines = new ArrayList<CartLine>();
	private final static  List<Item> items = new ArrayList<Item>();
	
	/**
	 * Adding the Items object
	 * to an Array list has generic Item type. 
	 */
	{
		Item itemOne = new Item(1, "Bread", new BigDecimal(0.40));
		Item itemTwo = new Item(2, "Meat", new BigDecimal(4.40));
		Item itemThree = new Item(3, "Soap",  new BigDecimal(0.80));
		Item itemFour = new Item(4, "Washing liquid", new BigDecimal(1.80));
		items.add(itemOne);
		items.add(itemTwo);
		items.add(itemThree);
		items.add( itemFour);
		
	}
	
	/**
	 * private function to 
	 * get item object from 
	 * @param itemId
	 * @return item Object or 
	 * null if item not found.
	 */
	private static Item getItemById(int itemId){
		
		for (Item item : items){
			
			if(item.getItemId() == itemId ){
				
				return item ;
			}
		}
		return null; 
	}

	/**
	 * Add item to the shopping cart
	 * VI using the ItemId.
	 * looping throw Cartlines elements
	 * if the ItemId passed to the function 
	 * matches the itemId in the cartlines list 
	 * increment quantity of an item then cut off the loop 
	 * round with return statement.
	 * calling getItemById function to get the same item VI itemId
	 * checking if the item not null is added to
	 * cardlines list that has line of the items that 
	 * customer wishes to shop 
	 * if the ItemId dose matched the itemId's in item list
	 * IllegalArgumentException throws.   
	 * @param itemId 
	 */
	public void addItemToCartByItem(int itemId){
		
		for(CartLine cartLine : cartLines ){
			
			if(cartLine.getItem().getItemId() == itemId ){
				cartLine.incrementQuantity();
				return;
			}
		}
		
		Item item = getItemById(itemId);
		
		if(item != null){
			cartLines.add(new CartLine(item));
		}
		else{
			throw new IllegalArgumentException("Invalid itemId entered. Please try with a valid itemId");
		}
		
	}
	
	/**
	 * 
	 * @param itemId
	 */
	/*public void removeItemToCartByItem(int itemId){
		
			for(CartLine cartLine : cartLines ){
				
				if(cartLine.getItem().getItemId() == itemId ){
					cartLine.decreaseQuantity();
					return;
				}
			}
			
			Item item = getItem();
			
			if(item != null){
				cartLines.remove(new CartLine(item ));
			}
			else{
				throw new IllegalArgumentException("Invalid itemId entered.  Please try with a valid itemId");
			}
	}*/
	
	/**
	 *  
	 * @return List object of type Cartline. 
	 */
	public List<CartLine> getCartLines(){
		
		return cartLines;
	}
	
	/**
	 *used to find cartLines list size  
	 * @return list size. 
	 */
	public int getItemCount() {
		return cartLines.size();
	}
	
	/**
	 * Return total Amount for the items
	 * in cartlines list by multiply the price for the item
	 * with Item quantity for each item object.  
	 * @return totalAmount.  
	 */
	public BigDecimal getTotalCost(){
		
		BigDecimal totalAmount = new BigDecimal(0) ;
		
		for(CartLine cartLine : cartLines){
			
			Item item = cartLine.getItem();
			totalAmount = totalAmount.add(item.getPrice().multiply(new BigDecimal(cartLine.getItemQuantity())));
		}
		return totalAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
		
	}
	
	/**
	 * Print items in cartline list 
	 * with their details using String buffer 
	 * object to display items details.
	 * @return String buffer object. 
	 */
	public String printCartItems(){
		
		StringBuffer sb = new StringBuffer();
		for(CartLine cartLine : cartLines ){
			
			sb.append("Item Name: " +  cartLine.getItem().getName() + "\n");
			sb.append("Item Cost: " +
					cartLine.getItem().getPrice().setScale(2, BigDecimal.ROUND_HALF_UP) + "\n");
			sb.append( "Item Quantity:"  + cartLine.getItemQuantity() + "\n");
		}
		sb.append("Total: " + getTotalCost());
		return sb.toString();
	}
}

package shopping;
import java.math.BigDecimal;
import java.util.List;

/**
 * Cartline class to 
 * create cartline objects.
 * @author alabsi
 *
 */
public class CartLine {
	
	/*
	 * CartLine Attributes
	 * Item 
	 * Item Quantity.
	 */
	private Item item;
	private int itemQuantity;
	
	/**
	* Default constructor
	*/
	public CartLine(){
		
	}
	
	/**
	 * Parameterised constructor
	 * First Item Quantity is one.
	 * @param item
	 */
	public CartLine(Item item) {
		this.item = item;
		this.itemQuantity = 1;
	}
	
	/**
	 * Get item
	 * @return item object
	 */
	public Item getItem() {
		return item;
	}
	
	/**
	 * Set item to value. 
	 * @param item
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	
	/**
	 * Get Item quantity
	 * @return itemQuantity
	 */
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	/**
	 * Set itemQuantity to value.
	 * @param itemQuantity
	 */
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	/**
	 * decrease item quantity. 
	 */
	public void decreaseQuantity(){
		itemQuantity--;
	}
	
	/**
	 * increment quantity.
	 */
	public void incrementQuantity(){
		itemQuantity++;
	}
	
	/**
	 * 
	 * @return
	 */
	/*public BigDecimal geLineCost() {

	   BigDecimal itemCost = item.getPrice().multiply(new BigDecimal(itemQuantity));
       return itemCost ;
    }*/
}

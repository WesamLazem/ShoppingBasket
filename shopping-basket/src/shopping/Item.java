package shopping;
import java.math.BigDecimal;

/**
 *  A Blueprint for an 
 *  an Item Object. 
 * @author alabsi
 *
 */
public class Item {
	
	 /*
	  * Item Attributes
	  * itemId
	  * name
	  * price.
	  */
	 private int itemId;
	 private String name;
	 private BigDecimal price;
	 
	 /**
	  * Default constructor
	  */
	 public Item(){
		 
	 }
	 
	 /**
	  * Parameterised constructor 
	  * @param itemId
	  * @param name
	  * @param price
	  */
	 public Item(int itemId, String name, BigDecimal price) {
	
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}
	 
	/**
	 * Get the item VI Id
	 * @return itemId
	 */
	public int getItemId() {
		return itemId;
	}
	
	/**
	 * Set the itemId to value.
	 * @param itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	/**
	 * Get teh item VI name.
	 * @return name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the Item name to value
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the item VI price
	 * @return price.
	 */
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * Set the price to value
	 * @param price.
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	/**
	 * Translating an Item object into 
	 * a well-defined textual
	 */
	@Override
	public String toString() {
		return  "Item Id " + this.itemId + "Item Name" + this.name + "Item Price" + this.price;
		
	}

}

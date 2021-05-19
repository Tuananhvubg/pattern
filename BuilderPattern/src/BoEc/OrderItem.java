package BoEc;
public class OrderItem {
	private String itemID;
	private String orderID;
	private String size;
	private int quantity;
	private String color;
	
	public OrderItem(String itemID, String orderID, String size, int quantity, String color) {
		super();
		this.itemID = itemID;
		this.orderID = orderID;
		this.size = size;
		this.quantity = quantity;
		this.color = color;
	}
	public String getItemID() {
		return itemID;
	}
	public String getOrderID() {
		return orderID;
	}
	public String getSize() {
		return size;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "Order Item infor: Item ID-"+this.itemID+" Order ID-"+this.orderID+" Size-"+this.size+
				" Quantity-"+this.quantity+" Color-"+this.color;
	}
}

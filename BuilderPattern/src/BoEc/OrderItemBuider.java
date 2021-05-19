package BoEc;
public class OrderItemBuider implements Builder{
	private String itemID;
	private String orderID;
	private String size;
	private int quantity;
	private String color;
	
	public OrderItemBuider(String itemID, String orderID) {
		this.itemID = itemID;
		this.orderID = orderID;
	}
	
	@Override
	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}
	
	public OrderItem buildOrderItem() {
		return new OrderItem(itemID, orderID, this.size, this.quantity, this.color);
	}
}

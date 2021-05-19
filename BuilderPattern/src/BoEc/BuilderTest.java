package BoEc;

public class BuilderTest {

	public static void main(String[] args) {
		OrderItemBuider orderItemBuider = new OrderItemBuider("MD5Code", "MD5Code");
		orderItemBuider.setColor("Blue");
		orderItemBuider.setQuantity(10);
		orderItemBuider.setSize("M");
		OrderItem orderItem = orderItemBuider.buildOrderItem();
		System.out.println(orderItem.toString());

	}

}

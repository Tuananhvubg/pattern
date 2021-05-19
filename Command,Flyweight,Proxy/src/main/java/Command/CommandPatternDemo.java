package Command;

public class CommandPatternDemo {
	public static void main(String[] args) {
        Laptop lap= new Laptop();
        BuyLaptop buyLaptopOrder = new BuyLaptop (lap);
        SellLaptop sellLaptopOrder = new SellLaptop (lap);
        Staff staff = new Staff();
        staff.takeOrder(buyLaptopOrder);
        staff.takeOrder(sellLaptopOrder);
        staff.placeOrders();
    }

}

package Command;

public class Laptop {
    private String name = "Dell01";
    private double price = 10000000;

    public void buy() {
        System.out.println("Laptop name: " + name +",Price" + price+" bought");
    }
    public void sell() {
        System.out.println("Laptop name: " + name +",Price:" + price +" sold");
    }

}

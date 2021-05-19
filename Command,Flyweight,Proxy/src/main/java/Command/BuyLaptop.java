package Command;

public class BuyLaptop implements Order {

	private Laptop lap;

    public BuyLaptop (Laptop lap) {
        this.lap = lap;
    }

    public void execute() {
        lap.buy();
    }
		
}

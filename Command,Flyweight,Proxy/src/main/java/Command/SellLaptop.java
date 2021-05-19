package Command;

public class SellLaptop implements Order{
    private Laptop lap;

    public SellLaptop (Laptop lap) {
        this.lap = lap;
    }

    public void execute() {
        lap.sell();
    }

}

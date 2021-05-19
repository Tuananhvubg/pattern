package Demo;
import Products.*;
import Sale.*;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Bike());
        testDevice(new Car());
    }

    public static void testDevice(Product product) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(product);
        basicRemote.sale();
        product.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(product);
        advancedRemote.sale();
        advancedRemote.mute();
        product.printStatus();
    }
}
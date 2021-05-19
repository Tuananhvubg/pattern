package Sale;

import Products.Product;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Product product) {
        super.product = product;
    }

    public void mute() {
        System.out.println("Remote: stop sale");
        product.setQuantity(0);
    }
}
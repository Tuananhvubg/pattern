package Sale;

import Products.Product;

public class BasicRemote implements RemoteSale {
    protected Product product;
    public BasicRemote() {}
    public BasicRemote(Product product) {
        this.product = product;
    }
    @Override
    public void sale() {
        System.out.println("Remote: sale toggle");
        if (product.isOnSale()) {
        	product.outOfStock();
        } else {
        	product.isOnSale();
        }
    }

    @Override
    public void quantityDown() {
        System.out.println("Remote: Quantity down");
        product.setQuantity(product.getQuantity() - 10);
    }

    @Override
    public void quantityUp() {
        System.out.println("Remote: Quantity up");
        product.setQuantity(product.getQuantity() + 10);
    }

    @Override
    public void priceDown() {
        System.out.println("Remote: price down");
        product.setPrice(product.getPrice() - 10);
    }

    @Override
    public void priceUp() {
        System.out.println("Remote: price up");
        product.setPrice(product.getPrice() + 10);
    }
}

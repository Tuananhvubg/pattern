package Products;

public class Car implements Product {
    private boolean on = false;
    private int quantity = 30;
    private int price = 100;

    @Override
    public boolean isOnSale() {
        return on;
    }

    @Override
    public void onsale() {
        on = true;
    }

    @Override
    public void outOfStock() {
        on = false;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        if (quantity > 100) {
            this.quantity = 100;
        } else if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm car.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current quantity is " + quantity );
        System.out.println("| Current price is " + price);
        System.out.println("------------------------------------\n");
    }
}

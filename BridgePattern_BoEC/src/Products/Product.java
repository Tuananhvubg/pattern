package Products;

public interface Product {
    boolean isOnSale();
    void onsale();
    void outOfStock();
    int getQuantity();
    void setQuantity(int quantity);
    int getPrice();
    void setPrice(int price);
    void printStatus();
}
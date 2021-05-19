package Flyweight;

public class LaptopImpl implements Laptop {

    private String name;
    private int date;
    private float price;

    public LaptopImpl(String name) {
        this.name = name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setPrice(float price) {
         this.price = price;
    }

    @Override
    public void importLaptop() {
        System.out.println("Da nhap kho " + name + ", nam xuat ban " + date + ", gia " + price);
    }


}



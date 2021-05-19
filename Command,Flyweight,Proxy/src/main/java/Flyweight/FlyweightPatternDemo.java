package Flyweight;

import java.util.Random;

public class FlyweightPatternDemo {
	private static final String[] names = {"ASUS", "LENOVO", "Samsung", "LG"};
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            LaptopImpl laptopImpl = (LaptopImpl) LaptopFactory.getLaptop(getRandomName());
            laptopImpl.setDate(getRandomDate());
            laptopImpl.setPrice(getRandomPrice());
            laptopImpl.importLaptop();
        }
    }

    private static String getRandomName() {
        int randomName = new Random().nextInt(names.length);
        return names[randomName];
    }

    private static int getRandomDate() {
        return (int) ((Math.random() * (2010 - 2021)) + 2019);
    }

    private static float getRandomPrice() {
        return (float) ((Math.random() * (600000 - 10000)) + 54000);
    }

}

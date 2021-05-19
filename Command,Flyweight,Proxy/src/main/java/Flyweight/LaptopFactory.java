package Flyweight;

import java.util.HashMap;

public class LaptopFactory {
private static final HashMap<String,LaptopImpl> laptopMap = new HashMap();
    
    public static Laptop getLaptop(String name){
        LaptopImpl laptopImpl = laptopMap.get(name);
        if(laptopImpl == null){
            laptopImpl = new LaptopImpl (name);
            laptopMap.put(name, laptopImpl);
            System.out.println("Laptop mới: " + name);
        }
        return laptopImpl;
    }

}	

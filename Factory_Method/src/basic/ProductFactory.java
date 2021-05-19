package basic;

import java.util.Random;

public class ProductFactory {

	private ProductFactory() {
	}
	public static Product createProduct(int id) {
		switch (id) {
		case 0: {
			return new CreatorProductA();
		}
		case 1:{
			return new CreatorProductB();
		}
		default:
			return null;
		}
		
	}
}

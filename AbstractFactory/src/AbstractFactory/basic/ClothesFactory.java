package AbstractFactory.basic;

public class ClothesFactory {
	public static Clothes getClothe(ClothesAbstractFactory factory) {
		return factory.createClothes();
	}
}

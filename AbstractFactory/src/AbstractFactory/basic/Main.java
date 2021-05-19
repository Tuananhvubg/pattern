package AbstractFactory.basic;

public class Main {

	public static void main(String[] args) {
		testAbstractFactory();
	}
	private static void testAbstractFactory() {
		Clothes tshirt = ClothesFactory.getClothe(new TShirtFactory("Vintage", "Brone"));
		Clothes underWear = ClothesFactory.getClothe(new UnderWearFactory("LoKhe", "Pink"));
		System.out.println("Created a T-Shirt:: "+tshirt.toString());
		System.out.println("Created a UnderWear:: "+underWear.toString());
	}
}

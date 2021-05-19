package AbstractFactory.basic;

public class UnderWearFactory implements ClothesAbstractFactory{
	private String style;
	private String color;
	
	public UnderWearFactory(String style, String color) {
		this.style = style;
		this.color = color;
	}

	@Override
	public Clothes createClothes() {
		return new UnderWear(style, color);
	}

}

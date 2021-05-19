package AbstractFactory.basic;

public class TShirtFactory implements ClothesAbstractFactory{
	private String style;
	private String color;
	
	public TShirtFactory(String style, String color) {
		this.style = style;
		this.color = color;
	}


	@Override
	public Clothes createClothes() {
		return new TShirt(style,color);
	}
}

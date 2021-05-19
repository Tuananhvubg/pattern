package AbstractFactory.basic;

public class TShirt extends Clothes{
	private String style;
	private String color;

	
	public TShirt(String style, String color) {
		this.style = style;
		this.color = color;
	}

	@Override
	public String getStyle() {
		return this.style;
	}

	@Override
	public String getColor() {
		return this.color;
	}
}

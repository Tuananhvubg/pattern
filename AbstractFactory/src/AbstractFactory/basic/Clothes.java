package AbstractFactory.basic;

public abstract class Clothes {
	public abstract String getStyle();
	public abstract String getColor();
	
	@Override
	public String toString() {
		return "TypeProduct=" + this.getStyle() +", Color=" + this.getColor();
	}
}

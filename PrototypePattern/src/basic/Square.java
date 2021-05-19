package basic;
public class Square extends Prototype{
	public String Color;
	
	public Square() {
		
	}
	public Square(Square target) {
		super(target);
		if(target != null) {
			this.Color = target.Color;
		}
	}
	@Override
	public Prototype clone() {
		return new Square(this);
	}
	
	@Override
	public boolean equals(Object object2) {
		if(!(object2 instanceof Square) || !super.equals(object2)) return false;
		Square prototype2 = (Square) object2;
		return prototype2.Color == Color;
	}
}

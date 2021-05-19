package basic;

public class CloneDemo {

	public static void main(String[] args) {
		Square square = new Square();
		square.x = 5;
		square.y = 5;
		square.Color = "Blue";
		
		if(square.x == square.y) {
			Square clonedSquare = (Square) square.clone();
			System.out.println("Color`s Square is " + clonedSquare.Color);
		}
	}

}

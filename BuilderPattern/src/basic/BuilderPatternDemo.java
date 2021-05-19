package basic;

public class BuilderPatternDemo {

	public static void main(String[] args) {
	ProductBuilderImpl productBuilderImpl = new ProductBuilderImpl();
	productBuilderImpl.setProductName("T-Shirt Vintage");
	productBuilderImpl.setProductColor("Sky-Blue");
	productBuilderImpl.setProductStyle("Vintage");
	productBuilderImpl.setProductType("T-Shirt");
	Product product = productBuilderImpl.buildProduct();
	System.out.println("Result *** " + product.toString());
	}
}

package basic;
public class Product {
	private String productName;
	private String productStyle;
	private String productColor;
	private String productType;
	
	public Product(String productName, String productStyle, String productColor, String productType) {
		super();
		this.productName = productName;
		this.productStyle = productStyle;
		this.productColor = productColor;
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductStyle() {
		return productStyle;
	}

	public String getProductColor() {
		return productColor;
	}

	public String getProductType() {
		return productType;
	}
	
	public String toString() {
		return "Product name: " + this.productName + ", Product Type: "
				+ this.productType + ", Product Style: " + this.productStyle+
				", Product Color: " + this.productColor;
	}
}

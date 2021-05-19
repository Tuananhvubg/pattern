package basic;
public class ProductBuilderImpl implements ProductBuilder{
	private String productName;
	private String productStyle;
	private String productColor;
	private String productType;
	
	public ProductBuilderImpl() {
	}
	
	@Override
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public void setProductStyle(String productStyle) {
		this.productStyle = productStyle;
	}

	@Override
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	@Override
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public Product buildProduct() {
		return new Product(productName, productStyle, productColor, productType);
	}
}

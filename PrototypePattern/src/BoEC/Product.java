package BoEC;
import java.util.Date;

public class Product {
	private String ProductName;
	private float Price;
	private String descripttion;
	private Date createdAt;
	private Date modifiedAt;

	public Product() {
	}

	public Product(String productName, float price, String descripttion, Date createdAt, Date modifiedAt) {
		super();
		ProductName = productName;
		Price = price;
		this.descripttion = descripttion;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	// clone Product method
	public Product cloneProduct() {
		Product product = new Product(this.ProductName, this.Price, this.descripttion, this.createdAt, this.modifiedAt);
		return product;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public String getDescripttion() {
		return descripttion;
	}

	public void setDescripttion(String descripttion) {
		this.descripttion = descripttion;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

}

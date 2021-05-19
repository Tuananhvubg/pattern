package BoEC;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CloneProduct {

	public static void main(String[] args) {
		   Date CreatedAt = new Date();  
		   System.out.println(CreatedAt.toString());  
		Product product = new Product("T-Shirt",(float) 8.0,"Made in Vietname", CreatedAt,null);
		Product clonedProduct = product.cloneProduct();
		clonedProduct.setPrice((float) 9.0);
		if(clonedProduct !=null) {
			Date ModifiedAt = new Date();  
			 clonedProduct.setModifiedAt(ModifiedAt);
			System.out.println("Modified Product name: " +clonedProduct.getProductName());
			System.out.println("Modified Product price: " + clonedProduct.getPrice());
			System.out.println("Modified Product description: " + clonedProduct.getDescripttion());
			System.out.println("Modified Product CreatedAt: " + clonedProduct.getCreatedAt());
			System.out.println("Modified Product ModifiedAt: " + clonedProduct.getModifiedAt());
		}
	}
}

package basic;
import java.util.Scanner;

import BoEC.PaymentFactory;
import BoEC.PaymentMethod;
import BoEC.PaymentType;
import BoEC.Payments;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Product id: ");
		int id = 0;
		id = scanner.nextInt();
		Product product = ProductFactory.createProduct(id);
		String productName = product.createProduct();
		System.out.println("Product name: "+productName);
	}
}

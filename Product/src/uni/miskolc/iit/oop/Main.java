package uni.miskolc.iit.oop;

import uni.miskolc.iit.oop.myproduct.Bread;
import uni.miskolc.iit.oop.myproduct.Product;

public class Main {

	public static void main(String[] args) {
		Bread bread = new Bread("Barna kenyér", 220, 21, 0.64);
		Product product = new Product("Hangszóró", 50000, 20);
		
		System.out.println(bread);
		System.out.println(product);
		Product product2 = new Bread("Kovászos kenyér", 500, 27, 0.64);
		System.out.println(product2);

		Bread bread2 = new Bread("Kifli", 300, 12, 0.1);
		
		System.out.println(Bread.firstIsMoreExpensive(bread2, (Bread)product2));
	}

}

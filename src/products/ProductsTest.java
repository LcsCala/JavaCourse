package products;
import java.util.Scanner;

public class ProductsTest {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
	
		Products one = new Products();
		System.out.print("Name: ");
		one.name = sc.next();
		System.out.print("Price: ");
		one.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		one.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + one); // Becomes with toString from Product.class refs object
		
		System.out.print("Enter the number of products to be added in stock: ");
		int x = sc.nextInt();
		one.addProducts(x);
		
		System.out.println();
		System.out.println("Updated data: " + one); 
		
		System.out.print("Enter the number of products to be removed from stock: ");
		x = sc.nextInt();
		one.removeProducts(x);
		
		System.out.println();
		System.out.println("Updated data: " + one);
		
		sc.close();
		
	}
}

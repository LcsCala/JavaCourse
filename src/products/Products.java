/*Write a program to read the data of a product in stock (name, price, and quantity in stock). Then:
- Display the product data (name, price, quantity in stock, and total value in stock).
- Add products to the stock and display the updated product data.
- Remove products from the stock and display the updated product data.*/

package products;

public class Products {
	public String name;
	public double price;
	public int quantity;
	
	
	double totalValueInStock() {
		return price * quantity;
	}
	
	void addProducts(int quantity) {
		this.quantity +=  quantity;
		return;
	}
	
	void removeProducts(int quantity) {
		int verify = this.quantity - quantity;
		
		if(verify < 0) {
			System.out.println("Error, stock can't be a negative value");
			return; 
		}
		this.quantity -= quantity;
		return;
	}
	
	public String toString() { //Transforms my object in a string that print what i have text here
		return
				name 
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity 
				+ " units, Total: "
				+ "$ " 
				+ String.format("%.2f", totalValueInStock()) + "\n";
	}
}

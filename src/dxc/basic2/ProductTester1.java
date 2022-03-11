package dxc.basic2;

 
 
class Product {

	private int productId;
	private float price;
	private int stock;
	

	public Product(int productId, float price , int stock)
	{
		System.out.println("Constructor called ");
		this.productId = productId;
		this.price = price;
		this.stock = stock;
	}
	
	public void displayDetails() {
		System.out.println("Product Id: " + productId);
		System.out.println("Product Price: " + price);
	}

	public void displayDetails(int discountPercentage) {
		System.out.println("Product discounted price: " + this.getPriceAfterDiscount(discountPercentage));
		if (this.stock > 0)
			System.out.println("Stock Available");
		else
			System.out.println("Stock not available");
	}

	public float getPriceAfterDiscount(int discountPercentage) {
		float discountedPrice = price - (price * discountPercentage / 100);
		return discountedPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public static double total(double price , int stock)
	{
		if( price > 0 && stock > 0)
		{
			double total = price* stock;
			return total;
		}
		return 0.0;
	}
}

//This is the class which creates new Product objects
public class ProductTester1 {
	public static void main(String[] args) {
		Product p1 = new Product( 1001 , 400 , 6);// declaring new object
		 
		Product p2 = new Product(1005 , 500, 4);
		 

		Product p3 = new Product(1, 100 , 1);

		p1.displayDetails();// method call
		System.out.println();
		p3.displayDetails();
		
		
		double total  = Product.total(p1.getPrice(), p1.getStock());
		
		total += Product.total(p2.getPrice(), p2.getStock());
		
		total += Product.total(p3.getPrice(), p3.getStock());
		
		System.out.println( "total price to pay :" + total);
				

	}
}

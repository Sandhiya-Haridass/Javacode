package exceptionhandling;
class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer(int id, String name, double walletBalance, String address) {
		this.id=id;
		this.name=name;
		this.walletBalance=walletBalance;
		this.address=address;
	}
}
class Item{
	int id;
	String name;
	double price;
	String companyName;
	boolean isInStock;
	public Item(int id, String name, double price, String comapnyName, boolean isInStock) {
		this.id=id;
		this.name=name;
		this.companyName=companyName;
		this.price=price;
		this.isInStock=isInStock;
	
}}
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
class ItemOutOfStockException extends Exception{
	public ItemOutOfStockException(String message) {
		super(message);
	}
}

public class ShoppingWebsite {
	public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException{
		if(!i.isInStock) {
			throw new ItemOutOfStockException("Item is out of stock");
		}
		if(c.walletBalance<i.price) {
			throw new InsufficientBalanceException("Insufficient Wallet Balance");
		}
		c.walletBalance-=i.price;
		return"Purchase Successful!!";
	
	}

	public static void main(String[] args) {
		Customer c=new Customer(1, "Sandy", 600.7, "Chennai");
		Item it=new Item(1098, "SmartPhone", 10000.0, "Iphone",true);
		ShoppingWebsite sw=new ShoppingWebsite();
		try {
			String result= sw.purchaseItem(it, c);
			System.out.println(result);
			
		}catch(ItemOutOfStockException| InsufficientBalanceException e) {
			System.out.println("Purchase Failed:"+e.getMessage());
		}
		

	}

}
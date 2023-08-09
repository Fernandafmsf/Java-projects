package entities;

public class Product {
	
	public String name; 
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return quantity*price;
	}
	
	public void AddProduct(int quantity) {
		this.quantity += quantity; //this é usado para referenciar o proprio objeto
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}

}

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
	
	//esse método esta sobreescrevendo método 'toString', um método da classe Object
	//esse método vai retornar a resposta 
	public String toString() {
		return name
				+", $"
				+String.format("%.2f", price)
				+", "
				+quantity
				+" units, Total: $ "
				+String.format("%.2f", TotalValueInStock());
	}

}

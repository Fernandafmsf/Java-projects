package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data");
		System.out.print("Name: ");
		product.name=sc.nextLine();//pega a variavel
		
		System.out.print("Price:");
		product.price=sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity=sc.nextInt();
		
		//USANDO O METODO PARA EXIBIR OS DADOS 
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProduct(quantity);
		
		//Não é necessário usar '.toString', automaticamente se entende que esse metodo está sendo chamado
		System.out.println("Updated data: "+product);
		
		System.out.println("Enter the number of products to be removed from stock:");
		quantity=sc.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.println("Updated data: "+product);
		
		sc.close();
	}

}

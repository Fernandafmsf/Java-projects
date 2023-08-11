package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Programa {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dolar price?");
		CurrencyConverter.dolarPrice=sc.nextDouble();
		
		System.out.print("How many dolar will be bought?");
		CurrencyConverter.dolarBought=sc.nextDouble();
		
		double totalReais = CurrencyConverter.totalValue();
		System.out.printf("Amount to be paid: %.2f",totalReais);
		
		sc.close();
	}

}

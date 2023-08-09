package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Programa {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empregado = new Employee();
		
		System.out.print("Name: ");
		empregado.name=sc.nextLine();
		
		System.out.print("Gross salary:");
		empregado.grossSalary=sc.nextDouble();
		
		System.out.print("Tax:");
		empregado.tax=sc.nextDouble();
		
		System.out.println(empregado);
		
		System.out.print("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		empregado.increaseSalary(percentage);
		
		System.out.println(empregado);
		
		sc.close();
	}

}

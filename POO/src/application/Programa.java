package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x= new Triangle();
		y=new Triangle();
		
		System.out.println("Enter the measures of triangle x:");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble(); 
		
		System.out.println("Enter the measures of triangle y:");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
		double areaX= x.area();
		
		double areaY= y.area();
		
		System.out.printf("Area x : %.4f%n",areaX);
		System.out.printf("Area y : %.4f%n",areaY);
		
		if(areaX>areaY) {
			System.out.println("X is greater");
		}else {
			System.out.println("y is greater");
		}
		
		
		sc.close();
		
	}
}

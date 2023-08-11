package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student estudante = new Student();
		
		System.out.println("Student:");
		estudante.name=sc.nextLine();
		estudante.nota_1=sc.nextDouble();
		estudante.nota_2=sc.nextDouble();
		estudante.nota_3=sc.nextDouble();
		
		System.out.println("Final grade: "+estudante.getFinalGrade());
		System.out.println(estudante.finalSituation());
		
		sc.close();
	}

}

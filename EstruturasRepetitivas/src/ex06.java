
import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
public class ex06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.printf("Digite um numero:");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			
			System.out.printf("Digite o numerador:");
			float a=sc.nextFloat();
			System.out.printf("Digite o denominador:");
			float b=sc.nextFloat();
			
			if(b!=0) {
				System.out.printf("%.1f\n\n",a/b);
			}else {
				System.out.println("Divisão impossível");
			}
			
		}
	
		
		sc.close();
	}

}


import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
//ordem crescente ou decrescente.

public class ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		int a=sc.nextInt();
		System.out.println("Digite outro número:");
		int b=sc.nextInt();
		
		if( a%b==0 || b%a==0) {
			System.out.println("São multiplos");
			System.out.println(a%b);
			System.out.println(b%a);
		}else {
			System.out.println("Não são multiplos");
		}
		
		
		sc.close();
	}
	
}


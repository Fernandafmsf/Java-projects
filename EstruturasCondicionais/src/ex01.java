
import java.util.Scanner;//necessário para usar o scanner 

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número");
		numero=sc.nextInt();
		
		if(numero>0) {
			System.out.println("Não negativo");
		}else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}
}


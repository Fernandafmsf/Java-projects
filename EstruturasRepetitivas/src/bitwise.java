
import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
//exemplo.

public class bitwise {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if((n & mask)!=0) {
			System.out.println("6th bit is true");
		}else {
			System.out.println("6th bit is false");
		}
		
		sc.close();
	}

}

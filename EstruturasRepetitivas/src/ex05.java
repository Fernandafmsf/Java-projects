
import java.util.Scanner;


public class ex05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números quer digitar?");
		int x=sc.nextInt();
		
		int numero=0;
		int qtdIn=0;
		int qtdOut=0;
		
		for(int i=0;i<x;i++) {
			System.out.println("Digite um número:");
			numero=sc.nextInt();
			
			if(numero>=10&&numero<=20) {
				qtdIn+=1;
			}else {
				qtdOut+=1;
			}
		}
		
		System.out.println(qtdIn+" in");
		System.out.println(qtdOut+" out");
		
		sc.close();
	}

}

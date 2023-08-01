import java.util.Scanner;
public class testeWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número");
		int x=sc.nextInt();
		
		int resultado=0;
		
		//while é usado quando não sabemos a quantidade de vezes que o código deve ser executado 
		while(x!=0) {
			resultado= resultado + x;
			System.out.println("Digite um número");
			x=sc.nextInt();
			
			
		}
		System.out.println("resultado: "+resultado);
		
		sc.close();
	}
}


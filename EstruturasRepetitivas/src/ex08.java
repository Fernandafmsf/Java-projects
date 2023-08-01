
import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
//exemplo.

public class ex08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um numero:");
		int n=sc.nextInt();
		//verifica se o numero é positivo
		if(n>0) {
			
			//laço de repetição que vai garantir a leitura dos N numeros
			for(int i=1;i<=n;i++) {
				int valor=i;
				
				//laço que vai permitir os calculos
				for(int x=0;x<3;x++) {
					System.out.print(valor+" ");
					valor= valor*i;
				}
				System.out.println();
				
				
			}
			
		
		}else {
			System.out.println("Digite um número positivo");
		}
		
		
		
		
		sc.close();
	}

}

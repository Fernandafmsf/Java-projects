
import java.util.Locale;
import java.util.Scanner;


public class ex07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos casos de teste você deseja realizar?");
		int casos=sc.nextInt();
		
		
		double somaMedia=0;
		double mediaPonderada=0;
		
		for(int i=0;i<casos;i++) {
			
			//laço responsável por ler3 valores em cada caso
			for(int n=0; n<3 ;n++ ) {
				double valor=0;
				System.out.printf("Digite um valor:");
				valor=sc.nextDouble();
				
				if(n==0) {
					somaMedia=(valor*2);
				}else if(n==1) {
					somaMedia+=(valor*3);
				}else if(n==2) {
					somaMedia+= (valor*5);
				}
				
				
			}
			mediaPonderada=somaMedia/10;
			System.out.printf("Media: %.1f \n" ,mediaPonderada);
		}
		
		sc.close();
	}

}

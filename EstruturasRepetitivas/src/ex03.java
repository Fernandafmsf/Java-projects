
import java.util.Scanner;

public class ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero=sc.nextInt();
		int alcool =0;
		int gasolina =0;
		int diesel =0;
		
		while(numero!=4) {
			switch(numero) {
				case 1:
					alcool=alcool+1;
					break;
				case 2:
					gasolina=gasolina+1;
					break;
				case 3:
					diesel=diesel+1;
					break;
				default: 
					break;
				
			}
			
			System.out.println("Digite um número:");
			 numero=sc.nextInt();	
			
		}
		System.out.println("Muito obrigado");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		
		sc.close();
	}

}

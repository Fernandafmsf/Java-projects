
import java.util.Locale;
import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class ex06 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//faz usar ponto como virgula 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		float numero=sc.nextFloat();
		
		if(numero>=0&&numero<=25) {
			System.out.println("Intervalo (0,25)");
		}else if(numero>25&&numero<=50) {
			System.out.println("Intervalo (25,50)");
		}else if(numero>50&&numero<=75) {
			System.out.println("Intervalo (50,75)");
		}else if(numero>75&&numero<=100) {
			System.out.println("Intervalo (75,100)");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
		
	}
	
}


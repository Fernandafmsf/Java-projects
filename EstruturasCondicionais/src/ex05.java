import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class ex05 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o código do produto?");
		int codigo = sc.nextInt();
		
		System.out.println("Qual a quantidade?");
		int qtd = sc.nextInt();
		
		double preco=0;
		
		switch(codigo) {
		case 1:
			preco = 4.00*qtd;
			break;
		case 2:
			preco=4.50*qtd;
			break;
		case 3:
			preco=5.00*qtd;
			break;
		case 4: 
			preco=2.00*qtd;
			break;
		case 5:
			preco=1.50*qtd;
			break;
		default: 
			System.out.println("Código inexistente. Escolha entre 1e 5");
		}
		
		System.out.printf("Total:%.2f",preco);
		
		sc.close();
		
	}
	
}

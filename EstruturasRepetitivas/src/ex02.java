
import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		System.out.println("Informe duas coordenadas:");
		x=sc.nextInt();
		y=sc.nextInt();
		
		while(x!=0 && y!=0) {
			
			
			if(x>0&&y>0) {
				System.out.println("primeiro");
			}else if(x<0&&y>0) {
				System.out.println("segundo");
			}else if(x<0&&y<0) {
				System.out.println("terceiro");
			}else if(x>0&&y<0) {
				System.out.println("quarto");
			}
			System.out.println("Informe duas coordenadas:");
			x=sc.nextInt();
			y=sc.nextInt();
			
		}
		
		
		sc.close();
	}

}

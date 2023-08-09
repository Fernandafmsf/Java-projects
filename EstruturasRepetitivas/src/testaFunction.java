
import java.util.Locale;
import java.util.Scanner;

public class testaFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Enter three numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x>y&& x>z) {
			aux=x;
		}if(y>z&&y>x) {
			aux=y;
		}else {
			aux=z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher: "+ value);
	}

}

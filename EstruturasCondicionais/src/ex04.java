import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class ex04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hora início:");
		int horaInicio=sc.nextInt();
		System.out.println("Hora final:");
		int horaFinal=sc.nextInt();
		int horaTotal=0;
		
		if(horaInicio<horaFinal) {
			horaTotal=horaFinal-horaInicio;
		}else if(horaInicio>horaFinal) {
			horaTotal = (24-horaInicio)+horaFinal;
		}else if(horaInicio==horaFinal) {
			horaTotal=24;
		}
		
		System.out.println("Duracao:"+horaTotal+"horas");
		sc.close();
	}
	
}


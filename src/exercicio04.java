import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
		// come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
		
		Scanner sc = new Scanner(System.in);
		int horaInicio, horaFim, horasDuracao;
		
		System.out.print("Que horas come�ou o jogo? ");
		horaInicio = sc.nextInt();
		System.out.print("Que horas terminou o jogo? ");
		horaFim = sc.nextInt();
		
		if (horaFim > horaInicio) {
			horasDuracao = horaFim - horaInicio;
			System.out.println("O jogo durou "+horasDuracao+" horas.");
		}
		else if (horaInicio > horaFim) {
			horasDuracao = (24 - horaInicio) + horaFim;
			System.out.println("O jogo durou "+horasDuracao+" horas.");
		}
		
		
		
		
		sc.close();

	}

}

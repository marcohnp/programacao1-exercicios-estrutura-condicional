import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um n�mero: ");
		x = sc.nextInt();

		if (x < 0) {
			System.out.println(x+" � negativo.");
		}
		else {
			System.out.println(x+" n�o � negativo.");
		}
		
		sc.close();
	}

}

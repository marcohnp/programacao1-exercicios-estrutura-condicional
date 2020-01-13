import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		
		
		if (x % 2 == 0) {
			System.out.println(x + " é par.");
		}
		else {
			System.out.println(x + " é impar.");
		}

		
		sc.close();
	}

}

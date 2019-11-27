package course;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int numero1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		int codigo2 = sc.nextInt();
		int numero2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total = numero1 * valor1 + numero2 * valor2;
		
		
		System.out.printf("VALOR A PAGAR: %.2f%n", total);
		sc.close();
	}

}

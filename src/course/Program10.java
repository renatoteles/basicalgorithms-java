package course;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double valor = 0;
		
		if (codigo == 1) {
			valor = 4.00 * quantidade;
		} else if (codigo == 2) {
			valor = 4.50 * quantidade;
		} else if (codigo == 3) {
			valor = 5.00 * quantidade;
		} else if (codigo == 4) {
			valor = 2.00 * quantidade;
		} else if (codigo == 5) {
			valor = 1.50 * quantidade;
		}
		
		System.out.printf("Total: R$ %.2f", valor);
		sc.close();
	}

}

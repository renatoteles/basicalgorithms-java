package course;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salario = valor * horas;
		
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numero, salario);
		sc.close();
	}

}

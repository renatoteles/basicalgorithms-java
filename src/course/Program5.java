package course;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double pi = 3.14159;
		double atriangulo = ( a * c ) / 2.0;
		double acirculo = pi * c * c;
		double atrapezio = ( (a + b) * c ) / 2.0;
		double aquadrado = b * b;
		double aretangulo = a * b;
		
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", atriangulo, acirculo, atrapezio, aquadrado, aretangulo);
		sc.close();
	}

}

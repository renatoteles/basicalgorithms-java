package course;

import java.util.Locale;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		if (a >= 0.00 && a <= 25.00) {
			System.out.println("Intervalo [0,25]");
		} else if (a > 25.00 && a <= 50.00) {
			System.out.println("Intervalo (25,50]");
		} else if (a > 50.00 && a <= 75.00) {
			System.out.println("Intervalo (50,75]");
		} else if (a > 75.00 && a <= 100.00) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
			
		sc.close();
	}

}

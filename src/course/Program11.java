package course;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int horas = 0;
		
		if (a > b) {
			horas = 24 - a;
			horas = horas + b;
		} else if (b > a) {
			horas = b - a;
		} else {
			horas = 24;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", horas);
		sc.close();
	}

}

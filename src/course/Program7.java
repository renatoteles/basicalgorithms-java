package course;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a >= 0 ) {
			System.out.println("N�O NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}

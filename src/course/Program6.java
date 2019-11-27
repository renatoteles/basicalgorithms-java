package course;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maior = 0;
		
		if (( a > b && a > c ) || ( a == b || a == c )) {
			maior = a;
		} else if (( b > a && b > c ) || ( b == a || b == c )){
			maior = b;
		} else if (( c > a && c > b ) || ( c == a || c == b )){
			maior = c;
		}
		
		System.out.printf("Higher = %d", maior);
		sc.close();
	}

}

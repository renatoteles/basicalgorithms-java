package course;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String last_name = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.printf("%s%n", name);
		System.out.printf("%d%n", bedrooms);
		System.out.printf("%.2f%n", price);
		System.out.printf("%s%n", last_name);
		System.out.printf("%d%n", age);
		System.out.printf("%.2f%n", height);
		sc.close();
	}

}

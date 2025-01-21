package Exer;

import java.util.Scanner;

public class ClassScanner {

	public static void main(String[] args) {
		// Objecte Scanner que llegeix de teclat
		Scanner in = new Scanner(System.in);
		// Espera rebre un int, en cas contrari llança una excepció
		int number = in.nextInt();
		// Espera rebre un double, en cas contrari llança una excepció
		double decimal = in.nextDouble();
		// Llegeix un text fins arrivar a primer espai
		String word = in.next();
		// Llegeix un text fins arribar al primer salt de línia (inclou els espais en blanc)
		String text = in.nextLine();
		// Tanquem el flux (stream)
		in.close();
	}

}

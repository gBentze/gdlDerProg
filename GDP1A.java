package de.gdplabor.aufgabe1;

import java.util.Scanner;

/**
 * Laboraufgaben
 *
 *
 * @author GuilaineLaure
 */
public class GDP1A {

	/**
	 * 
	 * @param args
	 *            keine
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl 1 eingeben");
		int zahl1 = scanner.nextInt();
		System.out.println("Zahl 2 eingeben");
		int zahl2 = scanner.nextInt();
		scanner.close();
		int a1 = zahl1 + zahl2;
		int a2 = zahl1 - zahl2;
		int a3 = zahl1 * zahl2;
		int a4 = zahl1 / zahl2;
		int a5 = zahl1 % zahl2;
		System.out.println(zahl1 + " + " + zahl2 + " = " + a1);
		System.out.println(zahl1 + " - " + zahl2 + " = " + a2);
		System.out.println(zahl1 + " * " + zahl2 + " = " + a3);
		System.out.println(zahl1 + " / " + zahl2 + " = " + a4);
		System.out.println(zahl1 + " % " + zahl2 + " = " + a5);

	}
}

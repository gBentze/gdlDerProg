package de.gdplabor.aufgabe1;

import java.util.Scanner;

/**
 * Laborenaufgaben
 * 
 * @author GuilaineLaure
 *
 */
public class GDP1B {

	/**
	 * 
	 * @param args
	 *            keine
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("bitte die Höhe des Kredits eingeben");
		int ko = scanner.nextInt();
		System.out.println("bitte die Zinssatz eingeben");
		int zins = scanner.nextInt();
		System.out.println("bitte die Laufzeit eingeben");
		int jahr = scanner.nextInt();
		scanner.close();
		int kn = ko  + (ko* jahr * zins) / 100;
       // ergebnis = ko + (ko * jahr * zins) / 100
//		ergebnis = kreditwert + (kreditwert * jahr * zinssatz) / 100
		System.out.println("Endbetrag nach " + jahr + " Jahren: " + kn + " Euro");
				

	}
}
package test;
import java.util.Scanner; 
public class Age{
	public static void main(String []args){
	 Scanner keyb = new Scanner(System.in); 
	 System.out.println("Entrez votre age"); 
	 int age  = keyb.nextInt();
	 keyb.close();
	 int annee = 2014 - age;
	 System.out.println("votre annee de naissance est: " + annee);	 
	}
}

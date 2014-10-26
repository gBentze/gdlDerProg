package test;
import java. util. Scanner;
public class RosesBlanches{
	public static void main (String[]args){
		Scanner keyb = new Scanner(System. in);
		System.out.println("combien avez vous recu?");
		int sommeRecu = keyb.nextInt();
		keyb.close();
		int livrFour = sommeRecu * 3/4;
		int reste = sommeRecu - livrFour;
		int divEquit = reste / 3;
		int café = divEquit / 2;
		int info = divEquit / 4;
		int billet = divEquit / 3;
		int fleur = reste - divEquit * 3;
		System.out.println("livres et fournitures " + livrFour + " Frs");
		System.out.println("vous pouvez ensuite acheter:");
		System.out.println(café + " cafés") ;
		System.out.println(info + " numeros du flash informatique");
		System.out.println( billet + " billets de metro");
		System.out.print("et il vous restera " + fleur + " Frs pour les roses blanches");
		
		


		
    
	}
}
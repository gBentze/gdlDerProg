package test;
import java.util.Scanner; 
public class Degre3{
	public static void main(String []args){
		 Scanner keyb = new Scanner(System.in); 
		 System.out.println("entrez x");
		 int x  = keyb.nextInt();
		 System.out.println("entrez y");
		 int y = keyb.nextInt();
		 keyb.close();
		 int z;
		 
		 z = x;
		 x = y;
		 y = z;
		 
		 System.out.println("x = " + x);
		 System.out.println("y = " + y);
		}
}

package ExerciciosLaçosRepetições;

import java.util.Scanner;

public class TABUADA {
	public static void main (String agrs[]) {
		Scanner read = new Scanner(System.in);
		int n;
		System.out.println("Tabuada do 4\n");
		
		for(int x=1; x<=10; x++)
			System.out.println("4 x "+ x +"= "+ 4*x);
		System.out.println("Escolha uma tabuada: ");
		n=read.nextInt();
		
		for(int x=1; x<=10; x++) {
			
			System.out.println(n + " X " +x+" = "+ n*x);}
		for(int x=1; x<=9; x++)
		{
			System.out.println();
			System.out.println("\n Tabuada do " + x + "\n");
			for(int y=1; y<=10; y++)
				System.out.println(x+ " x "+ y + " = "+ x*y);
		}
	}
	
}

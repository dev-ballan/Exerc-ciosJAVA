package ExerciciosLaçosRepetições;

import java.util.Scanner;

/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/

public class Exer2FOR {
	public static void main(String args[]){
		int n = 0, numeroP = 0, numeroI = 0;
		
		Scanner read = new Scanner(System.in);

		for(int x = 1; x <= 10; x++)
		{
			System.out.println("Insira um número: ");
			n = read.nextInt();
			
			if(n %2 == 0) 
				numeroP = numeroP +1;
				 if(n % 2 == 1)
					 numeroI = numeroI +1;
		}	
			System.out.println("\nOs números que são pares totalizam: " +numeroP);
			System.out.println("\nOs números ímpares totalizam: " + numeroI);
	}	
}

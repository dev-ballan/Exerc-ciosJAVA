package ExerciciosLa�osRepeti��es;

import java.util.Scanner;

/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.*/

public class Exer2FOR {
	public static void main(String args[]){
		int n = 0, numeroP = 0, numeroI = 0;
		
		Scanner read = new Scanner(System.in);

		for(int x = 1; x <= 10; x++)
		{
			System.out.println("Insira um n�mero: ");
			n = read.nextInt();
			
			if(n %2 == 0) 
				numeroP = numeroP +1;
				 if(n % 2 == 1)
					 numeroI = numeroI +1;
		}	
			System.out.println("\nOs n�meros que s�o pares totalizam: " +numeroP);
			System.out.println("\nOs n�meros �mpares totalizam: " + numeroI);
	}	
}

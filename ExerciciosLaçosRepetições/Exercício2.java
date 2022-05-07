package ExerciciosLaçosRepetições;

import java.util.Scanner;

public class Exercício2 {
	public static void main (String args[])
	{
		int  i, aux;
		int [] vetor = new int [3];
		
		Scanner read = new Scanner (System.in);
		
		for(i = 0; i<3; i++) {
			System.out.println("Entre com um número: ");
			vetor[i] = read.nextInt();
			
		}
		System.out.println(" ");
		
		for(i=0; i<3; i++) {
			for(int x=0; x<2; x++) {
				if(vetor[x] > vetor[x+1]){
					aux = vetor[x];
					vetor[x] = vetor[x+1];
					vetor[x+1] = aux;
				}
			}
			
		}
		System.out.println("\nNa ordem crescente: ");
		for(i=0; i<3; i++) {
			System.out.println(" "+vetor[i]);
		}
		
	}
	
}

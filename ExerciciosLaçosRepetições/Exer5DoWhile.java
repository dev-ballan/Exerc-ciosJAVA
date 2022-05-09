package ExerciciosLaçosRepetições;

/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.*/

import java.util.Scanner;

public class Exer5DoWhile {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n=0, soma=0;
		
		do {
			System.out.println("Digite um número: ");
			n = read.nextInt();
			soma = soma + n;
		}
		while(n != 0);
		{	
			System.out.println("\nA soma dos números digitados é de: " +soma);
			
		}
	
		
	}

}

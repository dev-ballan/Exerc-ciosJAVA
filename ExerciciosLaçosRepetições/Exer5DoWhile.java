package ExerciciosLa�osRepeti��es;

/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.*/

import java.util.Scanner;

public class Exer5DoWhile {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n=0, soma=0;
		
		do {
			System.out.println("Digite um n�mero: ");
			n = read.nextInt();
			soma = soma + n;
		}
		while(n != 0);
		{	
			System.out.println("\nA soma dos n�meros digitados � de: " +soma);
			
		}
	
		
	}

}

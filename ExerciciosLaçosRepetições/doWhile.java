package ExerciciosLaçosRepetições;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;
		
		do
		{
			System.out.println("\nEscolha uma tabuada do 1 ao 10\n");
			n = read.nextInt();
			for(int x=1; x<=10; x++)
					System.out.println(n + " X " +x+" = "+ n*x);	
		} while(n>0 && n<=10);
		System.out.println("\nValor inválido Fim do programa !!! ");
		
		
	}

}

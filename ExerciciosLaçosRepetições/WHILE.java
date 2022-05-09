package ExerciciosLaçosRepetições;

import java.util.Scanner;

public class WHILE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n, soma = 0;
		
		System.out.println("Digite um número para ser somado: ");
		n = read.nextInt();
		
		while(n>=0)
		{
			if(n%2 == 0)
				soma = soma +n;
				System.out.println("Digite um número para ser somado: ");
				n = read.nextInt();
			
		}
		System.out.println("A soma dos valores pares foi: "+ soma);
		
		System.out.println("Escolha uma tabuada do 1 ao 10\n");
		n = read.nextInt();
		
		while(n>0 && n<=10)
		{
			for(int x=1; x<=10; x++)
				System.out.println(n + " X " +x+" = "+ n*x);
				System.out.println("\nEscolha uma tabuada ...");
				n = read.nextInt();
		}
		System.out.println("\nTabuada Inválida...");
	}

}

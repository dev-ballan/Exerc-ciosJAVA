package ExerciciosLa�osRepeti��es;

import java.util.Scanner;

public class Exer6DoWhile {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero=0, soma=0, media=0;
		
		do {
			System.out.println("Insira um n�mero inteiro: ");
			numero = read.nextInt();
			
			if(numero % 3 ==0 && numero != 0);
			soma = soma + numero;	
		}
		while(numero != 0);
		{
			System.out.println("Insira um n�mero inteiro: ");
			numero = read.nextInt();
	
			if(numero % 3 ==0 && numero != 0);
			media = soma/numero;
			
		}
		System.out.println("A m�dia dos n�meros �: " + media);
	}

}

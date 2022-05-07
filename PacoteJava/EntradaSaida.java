package PacoteJava;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a,b,soma;
		System.out.println("Entre com o valor A: ");
		a = ler.nextInt();
		System.out.println("Entre com o valor B: ");
		b = ler.nextInt();
		soma = a + b;
		System.out.println("A soma foi de: " + soma);
		
	}
}

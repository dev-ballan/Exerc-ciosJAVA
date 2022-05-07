package ExerciciosLaçosRepetições;

import java.util.Scanner;

public class Exercício1 {
	 public static void main (String args[])
	 {
		 Scanner read = new Scanner (System.in);
		 int n1, n2, n3, maior;
		 
		 System.out.printf("Insira um número inteiro: ");
		 n1 = read.nextInt();
		 System.out.printf("Insira um número inteiro: ");
		 n2 = read.nextInt();
		 System.out.printf("Insira um número inteiro: ");
		 n3 = read.nextInt();
		
		 if(n1>n2 && n1>n3) {
			 System.out.println("O maior é: " + n1);
		 }
		 else if (n2>n3) {
			 System.out.println("O maior é: " + n2);
			 
		 }else {
			 System.out.println("O maior é: " + n3);
		 }
		 
	 }
}

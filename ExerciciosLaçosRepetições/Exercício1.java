package ExerciciosLa�osRepeti��es;

import java.util.Scanner;

public class Exerc�cio1 {
	 public static void main (String args[])
	 {
		 Scanner read = new Scanner (System.in);
		 int n1, n2, n3, maior;
		 
		 System.out.printf("Insira um n�mero inteiro: ");
		 n1 = read.nextInt();
		 System.out.printf("Insira um n�mero inteiro: ");
		 n2 = read.nextInt();
		 System.out.printf("Insira um n�mero inteiro: ");
		 n3 = read.nextInt();
		
		 if(n1>n2 && n1>n3) {
			 System.out.println("O maior �: " + n1);
		 }
		 else if (n2>n3) {
			 System.out.println("O maior �: " + n2);
			 
		 }else {
			 System.out.println("O maior �: " + n3);
		 }
		 
	 }
}

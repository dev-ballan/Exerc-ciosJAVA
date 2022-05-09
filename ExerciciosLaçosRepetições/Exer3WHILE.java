package ExerciciosLaçosRepetições;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/

import java.util.Scanner;

public class Exer3WHILE {
	public static void main(String args[]) {
		
		Scanner read = new Scanner(System.in);
		int i, idadeD =0, idadeC=0;
		
		System.out.println("Digite a sua idade: ");
		i = read.nextInt();
		
		while(i !=-99){
			if(i <= 21) 
				idadeC = idadeC +1;
						if(i >= 50) 
							idadeD = idadeD +1;
			System.out.println("\nDigite a sua idade: \n\n(Para encerrar digite -99)\n\n");
			i = read.nextInt();
		} 
		System.out.println("\nO total de pessoas com menos de 21 anos é de: "+idadeC+ " pessoas.");
		System.out.println("\nO total de pessoas com mais de 50 anos é de: "+idadeD+ " pessoas.");
			
		}
}


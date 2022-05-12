package MatrizVetor;

import java.util.Scanner;

public class Exer1VETOR {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int [] vetor = new int [5];
		int maiorPontuacao=0;
		int  x;
		
		for(int w=0; w<5; w++) {
			System.out.println("Digite um número: ");
			vetor[w] = read.nextInt();
			
			if(maiorPontuacao < vetor[w]) 
				maiorPontuacao = vetor[w];
			
		}	
			for(int w=0; w<5; w++){
			System.out.println("Os valores são: " + vetor[w]);
			}
		System.out.println("\nA maior pontuação é: " + maiorPontuacao);
	}
	}


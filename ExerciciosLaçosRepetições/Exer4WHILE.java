package ExerciciosLa�osRepeti��es;

import java.util.Scanner;

public class Exer4WHILE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int casoSexo, casoCarac;
		int idade, part =1;
		int qntCalma=0, qntNervoso=0, qntOutrosCalmos=0, qntAgressivo=0, qntNervosoMaior40=0, qntCalmaMenor18=0;
		
		while(part <= 2) 
		{
			do 
			{
				System.out.println("\nInsira sua idade: ");
				idade = read.nextInt();
				if(idade < 0)
					System.out.println("Idade inv�lida ... ");
			}
			while(idade < 0);
			
			do
			{
				System.out.println("Sexo: \n1-Feminino \n2-Masculino \n3-Outros ");
				casoSexo = read.nextInt();
				if(casoSexo <=0 || casoSexo >3)
					System.out.println("Op��o inv�lida...");
			}
			while(casoSexo <=0 || casoSexo >3);
			
			do
			{
				System.out.println("Insira sua caracter�stica que voc� mais se identifica: \n1-Calma \n2-Nervosa \n3-Agressiva. ");
				casoCarac = read.nextInt();
				if(casoCarac <=0 || casoCarac >3)
					System.out.println("Op��o inv�lida...");
				
			}
			while(casoCarac <=0 || casoCarac >3);
			
			if(casoCarac == 1)
				qntCalma += 1;
			if(casoSexo == 1 && casoCarac == 2)
				qntNervoso =+ 1;
			if(casoSexo == 2 && casoCarac == 3)
				qntAgressivo +=1;
			if(casoSexo == 3 && casoCarac == 1)
				qntOutrosCalmos +=1;
			if(idade > 40 && casoCarac == 2)
				qntNervosoMaior40 +=1;
			if(idade < 18 && casoCarac == 1)
				qntCalmaMenor18 +=1;
			part += 1;
		}
		
		System.out.println("O numero de pessoas calmas s�o: "+qntCalma+"\nO numero de mulheres nervosas s�o: "+qntNervoso+"\nO numero de homens agressivos s�o: "+ qntAgressivo+
				"\nO numero de outros calmos s�o: "+qntOutrosCalmos+"\nO numero de pessoas nervosas com mais de 40 anos s�o: "+ qntNervosoMaior40+"\nO numero de pessoas calmas com menos de 18 anos s�o: "+ qntCalmaMenor18);

	}

}

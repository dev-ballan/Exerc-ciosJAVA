package Herança.Exer1;

public class AcaoAnimal {

	public static void main(String[] args) {

		// CRIANDO OBJETOS	
		
		Cachorro dog = new Cachorro();
		Cavalo ca = new Cavalo();
		Preguiça pre = new Preguiça();
		
		System.out.println("\nCachorro: ");
		dog.acao();
		dog.som();
		
		System.out.println("\nCavalo: ");
		ca.acao();
		ca.som();
		
		System.out.println("\nPreguiça: ");
		pre.acao();
		pre.som();
		
		
		
		
		
		
	}
	

}

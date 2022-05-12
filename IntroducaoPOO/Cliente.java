package IntroducaoPOO;

public class Cliente {

	public static void main(String[] args) {

		String nome;
		
		int numReserva; 
		
		ModeloCliente cliente1 = new ModeloCliente();
		
		
		System.out.println("Cliente 1");
		cliente1.cartao();
		cliente1.nome="Allan";
		cliente1.sobrenome="Baad";
		cliente1.idade=23;
		cliente1.numReserva=15;
		
		cliente1.cadastro();
		
		ModeloCliente cliente2 = new ModeloCliente();
		
		System.out.println("Cliente 2");
		cliente2.nome="João";
		cliente2.sobrenome="Oliveira";
		cliente2.idade=25;
		cliente2.numReserva=18;
		
		cliente2.cadastro();
	}

}

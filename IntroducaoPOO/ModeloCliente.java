package IntroducaoPOO;

public class ModeloCliente {
	// Characteristic -> ATRIBUTOS
	
	String nome, sobrenome;
	int idade, numReserva;
	boolean pagCartao;
	
	public ModeloCliente(String nome, int numReserva) {
		this.nome = nome;
		this.numReserva = numReserva;
	}
		
	// METODOS
	
	
	public void cartao() {
		this.pagCartao = true;
		System.out.println("Pagamento com cartão. ");
	}
	
	public ModeloCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void pix() {
		this.pagCartao = false;
		System.out.println("Pagamento via Pix. ");
	}
	
	public void cadastro() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Sobrenome: " + this.sobrenome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Número da Reserva: " + this.numReserva);
		
	}
}	

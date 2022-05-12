package IntroducaoPOO;

public class ModeloAviao {
	
	//ATRIBUTOS
	
	public String modelo;
	public double velocidade;
	public int assentosMax;
	
	//METODO
	
	public ModeloAviao() {
		
	}
	// CONSTRUTOR
	public ModeloAviao(String modelo, double velocidade, int assentosMax) {
		super();
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.assentosMax = assentosMax;
	}
	public void aviao() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Velocidade: "+ this.velocidade);
		System.out.println("Assentos Maximos: " + this.assentosMax);
	}

}

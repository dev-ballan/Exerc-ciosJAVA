package IntroducaoPOO;

public class Aviao {

	public static void main(String[] args) {
		// instaciar = chamar o metodo para ser executado
		
		ModeloAviao aviao1 = new ModeloAviao();
		
		aviao1.modelo = "Boing 772";
		aviao1.velocidade = 900.5;
		aviao1.assentosMax = 250;
		aviao1.aviao();
		
	}

}

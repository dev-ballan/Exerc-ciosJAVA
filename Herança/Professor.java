package Herança;

// de quem ela é filha
public class Professor extends Pessoa{
	
	public String modulo;
	public double salario;
	
	// meted
	public void aumento(double n)
	{
		this.salario = this.salario+n; // ou this.salario +=n;
	}
}

package Herança;
// aluno herda tudo que a Pessoa tem
public class Aluno extends Professor{
	
	public int matricula;
	public String curso;
	
	// meted
	public void entregarAtividade()
	{
		System.out.println("Atividade entregue...");
	}
}

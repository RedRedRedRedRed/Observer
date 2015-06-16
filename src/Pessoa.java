
public class Pessoa implements Assinante{

	private String nome;

	public Pessoa(String nome){
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public void enviar(Edicao edicaoAtual) {
		System.out.println("Pessoa: " + nome + 
				" lendo a revista " + 
				edicaoAtual.getTitulo() +
				" lendo a edicao " + 
				edicaoAtual.getNumero() +
				" com " +
				edicaoAtual.getPaginas() +
				" paginas");
	}

}


public class Empresa implements Assinante{
	
	private String nome;

	public Empresa(String nome){
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
		System.out.println("Empresa: " + nome + 
				" colocou a revista " + 
				edicaoAtual.getTitulo() +
				" de edicao numero " + 
				edicaoAtual.getNumero() +
				" na recepcao, contendo " +
				 edicaoAtual.getPaginas() +
				" paginas");
	}
	

}

import java.util.ArrayList;
import java.util.List;


public class Revista extends Thread{

	
	private Edicao edicaoAtual = new Edicao();

	private List<Assinante> assinantes = new ArrayList<Assinante>();

	public void assinar(Assinante a){
		assinantes.add(a);
		System.out.println("Novo assinante: " + a.getNome());
	}
	public void remover(Assinante a){
		assinantes.remove(a);
	}

	public void emitirEdicao(){
		for(Assinante a: assinantes){
			a.enviar(edicaoAtual);
		}
	}

	@Override
	public void run(){

		try {

			for(int i=1; i<=25;i++){
				System.out.println("Imprimindo pagina " + i);
				edicaoAtual.addPagina();
				Thread.sleep(750);}
		}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		edicaoAtual.setNumero(1);
		emitirEdicao();
		}
	
	}


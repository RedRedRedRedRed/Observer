
public class Main {

	public static void main(String[] args) {
		
		Revista r = new Revista();
		r.start();
		try {
		
		Assinante a1 = new Pessoa("José");
		r.assinar(a1);
		Thread.sleep(1000);
		
		Assinante a2 = new Empresa("Caes e Gatos Ltda");
		r.assinar(a2);
		Thread.sleep(2250);
		
		Assinante a3 = new Pessoa("João");
		r.assinar(a3);
		Thread.sleep(1050);
		
		Assinante a4 = new Pessoa("Maria");
		r.assinar(a4);
		Thread.sleep(7000);
		
		Assinante a5 = new Empresa("Loop wallet");
		r.assinar(a5);
		Thread.sleep(2000);
		
		Thread.sleep(9000);
		Assinante a6 = new Empresa("Sidewalk");
		r.assinar(a6);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}


}

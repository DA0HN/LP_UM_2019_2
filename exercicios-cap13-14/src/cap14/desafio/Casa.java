package cap14.desafio;

public class Casa {
	private String cor;
	private int totalDePortas;
	private Porta[] portas = new Porta [10];

	public static void main(String[] args) {
		Casa minhaCasa = new Casa(2);
		Porta novaPorta = new Porta("aberta");
		novaPorta.aberta = true;
		novaPorta.isOpen();	      
		minhaCasa.pinta("Branco");
		minhaCasa.adicionaPorta(novaPorta);
		minhaCasa.adicionaPorta(novaPorta);
		minhaCasa.quantasPortasEstaoAbertas();
		minhaCasa.totalDePortas();
	}

	public Casa(int p){
		totalDePortas = p;

		for(int i = 0; i < totalDePortas; i++)
		{
			Porta porta = new Porta("fechada");
			portas[i] = porta;
		}

		for(int i = totalDePortas; i < portas.length; i++)
		{
			portas[i] = null;
		}
	}

	void pinta(String cor) {
		this.cor = cor;
		System.out.println(this.cor);
	}

	int quantasPortasEstaoAbertas() {
		int cont = 0;
		for (int i = 0; i < totalDePortas; i++) {
			if (portas[i].aberta == true) {
				cont++;
			}			
		}
		System.out.println("Núumero de portas abertas: " + cont);
		return cont;
	}

	void adicionaPorta(Porta p) {
		if (totalDePortas < portas.length) {
			portas[totalDePortas] = p;
			totalDePortas++;
		} 
		else {
			System.out.println("Array cheia");
		}
	}

	int totalDePortas() {
		int cont = 0;
		for (int i = 0; i < portas.length; i++) {
			if (portas[i] != null) {
				cont++;
			}
		}
		System.out.println("Total de portas: " + cont);
		return cont;
	}
}

package apostila;

public class Program {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.saca(300);
		minhaConta.deposita(500);
		
		minhaConta.getTitular().setCpf("001.012.a02");
		
		System.out.println(minhaConta.recuperaDadosParaImpressao());
	}
	// programado até a pagina 76
	
}

package cap14.exercicio;

import cap14.exercicio.modelo.Conta;
import cap14.exercicio.modelo.ContaCorrente;

public class TestaArray {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		for(int i=0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(Math.random() * (100 - i) + 1);
			System.out.println(conta);
			contas[i] = conta;
		}
		double total = 0d;
		for(int i=0; i < contas.length; i++) {
			total += contas[i].getSaldo();
		}
		double media = total/contas.length;
		
		System.out.println("Média: " + media);
		
	}
}

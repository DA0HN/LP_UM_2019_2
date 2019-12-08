package calculadora;

import java.util.Locale;

import teclado.Teclado;

public class TesteCalculadora {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double numero1 = Teclado.leDouble("Digite o numero um");
		double numero2 = Teclado.leDouble("Digite o numero dois");
		String operacao = Teclado.leString("Digite operação ( + - * / ) ");
		
		Calculadora c = new Calculadora();
		
		c.calcular(numero1, numero2, operacao);
		c.displayData();
		
		Teclado.fechaLeitura();
	}

}

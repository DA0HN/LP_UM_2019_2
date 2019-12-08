package calculadora;

public class Calculadora {
	private double result;
	Calculadora(){
		this.result = 0;
	}
	public double calcular(double x, double y, String operacao) {
		double solution;
		switch(operacao) {
		case "+":
			solution = x + y;
			break;
		case "-":
			solution = x - y;
			break;
		case "*":
			solution = x * y;
			break;
		case "/":
			solution = divisaoPorZero(y) ? 0.0 : (x/y);
			break;
		default:
			solution = 0;
			break;
		}
		this.result = solution;
		return solution;
	}
	private boolean divisaoPorZero(double y) {
		return( y == 0 ? true : false);
	}
	public void displayData() {
		System.out.printf("Resultado da última operação: %.12f", this.result);
	}
}


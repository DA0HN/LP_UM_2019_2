package entities;

//import apostila.Cliente;
//import apostila.Conta;
//import apostila.Data;

public class Conta {
	private int numeroDaConta;
	private double limite;
	private double saldo;
	private Cliente titular;
	private Data dataDeAbertura;
	private static int totalDeContas;	// variavel compartilhada por todos os objetos dessa classe
	
	public Conta(Cliente titular) {
		this();
		this.titular = titular;
	}
	
	public Conta(){
		this.numeroDaConta = 12364235;
		this.limite = 10000;
		this.saldo = 1000;
		this.titular = new Cliente();
		this.dataDeAbertura = new Data();
		// atributo visivel para todos objetos dessa classe
		Conta.totalDeContas++;	
	}
	public Conta(int numeroDaConta, double limite,double saldo, Cliente titular, Data dataDeAbertura){
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.dataDeAbertura = dataDeAbertura;
		this.saldo = saldo;
		this.limite = limite;
		this.dataDeAbertura = new Data();
		Conta.totalDeContas++;
	}
	public static int getTotalDeContas() {
		return( Conta.totalDeContas );
	}
	public boolean saca(double valor) {
		if(this.saldo < valor && this.saldo <= this.limite) {
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}	
	}
	double calculaRendimento() {
		return this.saldo*0.1;
	}
	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	public boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if( !retirou ) {
			System.out.println("Não foi possivel transferir");
			return false;
		}
		else {
			System.out.printf("Transferencia de %.2f feita com sucesso de %s para %s%n", valor ,this.titular.getNome(), destino.getTitular().getNome());
			destino.deposita(valor);
			return true;
		}
	}
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular.nome + " " + this.titular.sobrenome;
		dados += "\nCPF: " + this.titular.cpf;
		dados += "\nNumero da conta: " + this.numeroDaConta;
		dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
		dados += "\nSaldo atual: " + String.format("%.2f", this.saldo);
		dados += "\nLimite do valor de saque: " + String.format("%.2f", this.limite);
		dados += "\nRendimento: " + String.format("%.3f", calculaRendimento()) + " A.M (Ao Mês)";
		
		return dados;
	}
	
	public int getNumero() {
		return numeroDaConta;
	}
	public void setNumero(int numero) {
		this.numeroDaConta = numero;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSaldo() {
		return saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(String nome, String sobrenome, String cpf) {
		Cliente cliente= new Cliente(nome, sobrenome, cpf);
		this.titular = cliente;
	}
	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}
	public void setDataDeAbertura(int dia, int mes, int ano) {
		Data data = new Data(dia, mes, ano);
		this.dataDeAbertura = data;
	}
}

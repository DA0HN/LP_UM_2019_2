package entities;

public class Data {
	int dia;
	int mes;
	int ano;
	public Data(){
		this.dia = 1;
		this.mes = 8;
		this.ano = 2019;
	}
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public String formatada() {
		return( "0"+this.dia+"/"+"0"+this.mes+"/"+this.ano );
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}

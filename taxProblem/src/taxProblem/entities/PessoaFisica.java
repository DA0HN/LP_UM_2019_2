package taxProblem.entities;

public class PessoaFisica extends Contribuinte {

	private Double gastoComSaude = 0d;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	@Override public Double imposto() {
		if( this.getRendaAnual() >= 20000) {
			return (this.getRendaAnual() * 0.25) - ( this.getGastoComSaude() * 0.5 );
		}
		else {
			return (this.getRendaAnual() * 0.15) - ( this.getGastoComSaude() * 0.5 );
		}
	}

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}
	
	
}

package entities;



public class Pessoa_Fisica extends Declaração {
	
	private Double gastosComSaude;
	
	 public Pessoa_Fisica() {
		
	}
	 	
	public Pessoa_Fisica( String name, Double rendaAnual, Double gastosComSaude) {
		super(name, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double imposto() {
		if(getRendaAnual()<= 20000.00) {
			 double sum = getRendaAnual() * 0.15;
			 return sum -(gastosComSaude*0.5);
		}else {
			double sum = getRendaAnual() * 0.25;
			return sum - (gastosComSaude * 0.5);
		}
	}
}

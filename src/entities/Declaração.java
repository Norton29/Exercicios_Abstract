package entities;

public abstract class Declara��o {
	
	
	
	private String name;
	private Double rendaAnual;
	
	public Declara��o() {
	}
	
	public Declara��o(String name, Double rendaAnual) {		
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public abstract double imposto();
	
}

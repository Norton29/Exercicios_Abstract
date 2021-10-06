package entities;

import entities.Enum.Pessoa;

public abstract class Declara��o {
	
	
	private Pessoa pessoa;
	private String name;
	private Double rendaAnual;
	
	public Declara��o() {
	}
	
	public Declara��o(Pessoa pessoa, String name, Double rendaAnual) {
		this.pessoa = pessoa;
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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

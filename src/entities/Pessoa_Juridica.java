package entities;

import entities.Enum.Pessoa;

public class Pessoa_Juridica extends Declara��o {

	
	private Integer numeroDeFuncionarios;

	public Pessoa_Juridica() {
		super();
	}

	public Pessoa_Juridica(Pessoa pessoa, String name, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(pessoa, name, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}


	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double imposto() {
		if (numeroDeFuncionarios <= 10) {
			return getRendaAnual() *0.16;
		} else {
			return getRendaAnual() * 0.14;
		}

	}

}
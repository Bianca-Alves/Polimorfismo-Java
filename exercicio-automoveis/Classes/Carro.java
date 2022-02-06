package Classes;

public class Carro {
	// Atributos da classe
	protected int ano;
	protected String placa;
	protected String proprietario;

	// Fun��o 1 - M�todo construtor
	public Carro(int ano, String placa, String proprietario) {
		this.ano = ano;
		this.placa = placa;
		this.proprietario = proprietario;
	}

	// M�todos acessores
	public int getAno() {
		return ano;
	}

	public String getPlaca() {
		return placa;
	}

	public String getProprietario() {
		return proprietario;
	}

	// Fun��o 2 - Mostrar
	public void apresentarCarro() {
		System.out.println("Ano: " + this.getAno());
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Propriet�rio: " + this.getProprietario());
	}
}
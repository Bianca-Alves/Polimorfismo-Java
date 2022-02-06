package Classes;

public class Moto {
	// Caracter�sticas da Classe
	public String Placa;
	public String Propriet�rio;
	public String Ano;

	// Fun��o 1
	public Moto() {
		this("", "", "");
	}

	// Construtor
	public Moto(String Propriet�rio, String Ano, String Placa) {
		// Modelo Construtor com Par�metro
		this.Placa = Placa;
		this.Propriet�rio = Propriet�rio;
		this.Ano = Ano;
	}

	// M�todos Acessores

	// Placa
	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String Placa) {
		this.Placa = Placa;
	}

	// Propriet�rio
	public String getPropriet�rio() {
		return Propriet�rio;
	}

	public void setPropriet�rio(String Propriet�rio) {
		this.Propriet�rio = Propriet�rio;
	}

	// Ano
	public String getAno() {
		return Ano;
	}

	public void setCor(String Ano) {
		this.Ano = Ano;
	}

	// Fun��o 2 - Mostrar ao usu�rio
	public void apresentarMoto() {
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Proriet�rio: " + this.getPropriet�rio());
		System.out.println("Ano: " + this.getAno());
	}
}
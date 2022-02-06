package Classes;

public class Moto {
	// Características da Classe
	public String Placa;
	public String Proprietário;
	public String Ano;

	// Função 1
	public Moto() {
		this("", "", "");
	}

	// Construtor
	public Moto(String Proprietário, String Ano, String Placa) {
		// Modelo Construtor com Parâmetro
		this.Placa = Placa;
		this.Proprietário = Proprietário;
		this.Ano = Ano;
	}

	// Métodos Acessores

	// Placa
	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String Placa) {
		this.Placa = Placa;
	}

	// Proprietário
	public String getProprietário() {
		return Proprietário;
	}

	public void setProprietário(String Proprietário) {
		this.Proprietário = Proprietário;
	}

	// Ano
	public String getAno() {
		return Ano;
	}

	public void setCor(String Ano) {
		this.Ano = Ano;
	}

	// Função 2 - Mostrar ao usuário
	public void apresentarMoto() {
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Prorietário: " + this.getProprietário());
		System.out.println("Ano: " + this.getAno());
	}
}
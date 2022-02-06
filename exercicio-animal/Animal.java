public class Animal {
	// Atributos da classe
	private int quantPatas;
	private String especie;
	private double peso;

	// Fun��o 1 - M�todo construtor
	public Animal(int quantPatas, String especie, double peso) {
		this.quantPatas = quantPatas;
		this.especie = especie;
		this.peso = peso;
	}

	// M�todos acessores
	public int getQuantPatas() {
		return quantPatas;
	}

	public void setQuantPatas(int quantPatas) {
		this.quantPatas = quantPatas;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Fun��o 2 - M�todo imprimir
	public void imprimirAnimal() {
		System.out.println("Quantidade de patas: " + this.getQuantPatas());
		System.out.println("Esp�cie: " + this.getEspecie());
		System.out.println("Peso: " + this.getPeso() + " kg.");
	}
}
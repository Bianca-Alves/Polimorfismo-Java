package Classes;

public class Caminhao {
	// Atributos da classe
	private int carga;
	private int rodas;
	private int ano;

	// Função 1 - Método construtor
	public Caminhao(int carga, int rodas, int ano) {
		this.carga = carga;
		this.rodas = rodas;
		this.ano = ano;
	}

	// Métodos acessores
	public int getCarga() {
		return carga;
	}

	public int getRodas() {
		return rodas;
	}

	public int getAno() {
		return ano;
	}

	// Função 2 - Mostrar
	public void apresentarCaminhao() {
		System.out.println("Carga: " + this.getCarga() + " toneladas.");
		System.out.println("Rodas: " + this.getRodas());
		System.out.println("Ano: " + this.getAno());
	}
}
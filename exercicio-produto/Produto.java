public class Produto {
	// Atributos da classe
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;

	// Fun��o 1 - M�todo construtor sem par�metros
	public Produto() {
	}

	// Fun��o 2 - M�todo construtor com par�metros
	public Produto(String nome, double precoCusto, double precoVenda, double margemLucro) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.margemLucro = margemLucro;
	}

	// M�todos acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		if (precoVenda < precoCusto) {
			System.out.println("O pre�o de venda n�o pode ser inferior ao pre�o de compra!");
		} else {
			this.precoVenda = precoVenda;
		}
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}

	// Fun��o 3 - C�lculo da margem de lucro
	public double getCalcularMargemLucro() {
		margemLucro = precoVenda - precoCusto;
		return margemLucro;
	}

	// Fun��o 4 - Retorno do percentual de lucro
	public double getMargemLucroPercentual() {
		margemLucro = (margemLucro * 100) / precoCusto;
		return margemLucro;
	}

	// Fun��o 5 - Mostrar
	public void apresentarProduto() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Valor de custo: " + this.getPrecoCusto());
		System.out.println("Valor de venda: " + this.getPrecoVenda());
		System.out.println("Margem de lucro: " + this.getCalcularMargemLucro());
		System.out.println("Percentual da margem de lucro: " + this.getMargemLucroPercentual() + "%");
	}
}
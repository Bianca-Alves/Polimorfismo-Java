public class Produto {
	// Atributos da classe
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;

	// Função 1 - Método construtor sem parâmetros
	public Produto() {
	}

	// Função 2 - Método construtor com parâmetros
	public Produto(String nome, double precoCusto, double precoVenda, double margemLucro) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.margemLucro = margemLucro;
	}

	// Métodos acessores
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
			System.out.println("O preço de venda não pode ser inferior ao preço de compra!");
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

	// Função 3 - Cálculo da margem de lucro
	public double getCalcularMargemLucro() {
		margemLucro = precoVenda - precoCusto;
		return margemLucro;
	}

	// Função 4 - Retorno do percentual de lucro
	public double getMargemLucroPercentual() {
		margemLucro = (margemLucro * 100) / precoCusto;
		return margemLucro;
	}

	// Função 5 - Mostrar
	public void apresentarProduto() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Valor de custo: " + this.getPrecoCusto());
		System.out.println("Valor de venda: " + this.getPrecoVenda());
		System.out.println("Margem de lucro: " + this.getCalcularMargemLucro());
		System.out.println("Percentual da margem de lucro: " + this.getMargemLucroPercentual() + "%");
	}
}
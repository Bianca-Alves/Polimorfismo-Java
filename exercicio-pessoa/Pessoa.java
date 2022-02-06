
public class Pessoa {
	// Atributos da classe
	private String nome;
	private int anoNascimento;
	private double altura;
	private int anoAtual;
	private int idade;

	// Função 1 - Método construtor
	public Pessoa() {
	}

	// Métodos acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	// Função 2 - Cálculo da idade
	public int getCalcularIdade() {
		idade = anoAtual - anoNascimento;
		return idade;
	}

	// Função 3 - Mostrar
	public void apresentarPessoa() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Ano de nascimento: " + this.getAnoNascimento());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Idade: " + this.getCalcularIdade());
	}
}
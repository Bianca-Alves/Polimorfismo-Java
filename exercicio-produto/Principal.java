import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		double precoCusto;
		double precoVenda;

		Produto produto = new Produto();

		System.out.print("Digite o nome do produto: ");
		nome = sc.nextLine();
		produto.setNome(nome);

		System.out.print("Digite o valor de custo do produto: ");
		precoCusto = sc.nextDouble();
		produto.setPrecoCusto(precoCusto);

		System.out.print("Digite o valor de venda do produto: ");
		precoVenda = sc.nextDouble();
		produto.setPrecoVenda(precoVenda);
		System.out.println("");

		System.out.println("-------------- PRODUTO: " + nome + " --------------");
		produto.apresentarProduto();
		System.out.println("--------------------------------------------");
		sc.close();
	}
}
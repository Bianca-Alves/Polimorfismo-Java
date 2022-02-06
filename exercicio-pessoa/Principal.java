import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		int anoNascimento, anoAtual;
		double altura;

		Pessoa pessoa = new Pessoa();

		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		pessoa.setNome(nome);

		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = sc.nextInt();
		pessoa.setAnoNascimento(anoNascimento);

		System.out.print("Digite sua altura: ");
		altura = sc.nextDouble();
		pessoa.setAltura(altura);

		System.out.print("Digite o ano atual: ");
		anoAtual = sc.nextInt();
		pessoa.setAnoAtual(anoAtual);
		System.out.println("");

		System.out.println("--------- DADOS DA PESSOA ---------");
		pessoa.apresentarPessoa();
		System.out.println("-----------------------------------");
		sc.close();
	}
}
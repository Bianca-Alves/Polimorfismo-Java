import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Funcionario Pedro = new Funcionario();

		Pedro.SalarioBruto = 2500.00;
		Pedro.Imposto = 150.00;

		System.out.println("O salário líquido de Pedro é: " + Pedro.salarioLiquido());
		System.out.print("Insira o valor a ser aumentado no salário: ");
		Pedro.valor = sc.nextDouble();

		System.out.println("O valor do salário líquido de Pedro com o aumento é de: " + Pedro.aumentaSalario());
		System.out.println("---------------------------------------------------------------------------------");

		Funcionario Vagner = new Funcionario();

		Pedro.SalarioBruto = 3800.00;
		Pedro.Imposto = 240.00;

		System.out.println("O salário líquido de Vagner é: " + Vagner.salarioLiquido());
		System.out.print("Insira o valor a ser aumentado no salário: ");
		Vagner.valor = sc.nextDouble();

		System.out.print("O valor do salário líquido de Vagner com o aumento é de: " + Vagner.aumentaSalario());
		System.out.println("---------------------------------------------------------------------------------");
		sc.close();
	}
}
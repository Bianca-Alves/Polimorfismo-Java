import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Funcionario Pedro = new Funcionario();

		Pedro.SalarioBruto = 2500.00;
		Pedro.Imposto = 150.00;

		System.out.println("O sal�rio l�quido de Pedro �: " + Pedro.salarioLiquido());
		System.out.print("Insira o valor a ser aumentado no sal�rio: ");
		Pedro.valor = sc.nextDouble();

		System.out.println("O valor do sal�rio l�quido de Pedro com o aumento � de: " + Pedro.aumentaSalario());
		System.out.println("---------------------------------------------------------------------------------");

		Funcionario Vagner = new Funcionario();

		Pedro.SalarioBruto = 3800.00;
		Pedro.Imposto = 240.00;

		System.out.println("O sal�rio l�quido de Vagner �: " + Vagner.salarioLiquido());
		System.out.print("Insira o valor a ser aumentado no sal�rio: ");
		Vagner.valor = sc.nextDouble();

		System.out.print("O valor do sal�rio l�quido de Vagner com o aumento � de: " + Vagner.aumentaSalario());
		System.out.println("---------------------------------------------------------------------------------");
		sc.close();
	}
}
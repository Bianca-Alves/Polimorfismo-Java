
public class Funcionario {

	String Nome;
	double SalarioBruto;
	double Imposto;
	double valor;
	double salarioLiquido;

	double salarioLiquido() {

		return SalarioBruto - Imposto;
	}

	double aumentaSalario() {

		return salarioLiquido = salarioLiquido + valor;
	}
}
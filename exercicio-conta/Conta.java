//Classe
public class Conta {
	double saldo;
	int agencia;
	int conta;
	String titular;

//Fun��o 1 - sem retorno mas com par�metro
	void depositar(double valor) {
		saldo = saldo + valor;
	}

//Fun��o 2 - com retorno mas sem par�metro
	double extrato() {
		return saldo;
	}

//Fun��o 3 - com retorno e com par�metro
	String sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return "Valor sacado com sucesso!!!";
		}
		return "Valor insuficiente para sacar";
	}
}
//Classe
public class Conta {
	double saldo;
	int agencia;
	int conta;
	String titular;

//Função 1 - sem retorno mas com parâmetro
	void depositar(double valor) {
		saldo = saldo + valor;
	}

//Função 2 - com retorno mas sem parâmetro
	double extrato() {
		return saldo;
	}

//Função 3 - com retorno e com parâmetro
	String sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return "Valor sacado com sucesso!!!";
		}
		return "Valor insuficiente para sacar";
	}
}
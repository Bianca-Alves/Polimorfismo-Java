public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiro = new Conta();
		primeiro.saldo = 200;
		System.out.println("Saldo na conta inicial = " + primeiro.saldo);
		primeiro.depositar(200);
		System.out.println("Saldo ap�s o dep�sito = " + primeiro.extrato());
		System.out.println(primeiro.sacar(100));
		System.out.println("Saldo final da conta = " + primeiro.saldo);
		System.out.println(primeiro.extrato());
	}
}
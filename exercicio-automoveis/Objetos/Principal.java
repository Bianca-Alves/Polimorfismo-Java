package Objetos;

import Classes.*;

public class Principal {

	public static void main(String[] args) {
		System.out.println("----------------- Caminhão -----------------");

		Caminhao caminhao = new Caminhao(16, 10, 2020);
		caminhao.apresentarCaminhao();
		System.out.println("");

		System.out.println("----------------- Carro --------------------");
		Carro carro = new Carro(2019, "ABC-1234", "João Almeida de Souza");
		carro.apresentarCarro();
		System.out.println("");

		System.out.println("----------------- Moto ---------------------");
		Moto infoMoto = new Moto("RME-0447", "Thayani Pereira", "2010");
		infoMoto.apresentarMoto();
		System.out.println("");
	}
}
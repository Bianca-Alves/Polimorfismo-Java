
public class Principal {

	public static void main(String[] args) {

		Quadrado quadrado1 = new Quadrado();

		quadrado1.altura = 20.5;
		quadrado1.base = 20.5;

		System.out.println("A �rea do quadrado 1 �: " + quadrado1.calcularArea());

		Quadrado quadrado2 = new Quadrado();

		quadrado2.altura = 30.5;
		quadrado2.base = 30.5;

		System.out.println("A �rea do quadrado 2 �: " + quadrado2.calcularArea());
	}
}
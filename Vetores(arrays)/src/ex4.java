import java.util.Scanner;

public record ex4() {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		double[] x = new double[7];
		String[] dias = { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira",
				"Sábado" };
		double media = 0;

		for (int i = 0; i < x.length; i++) {

			System.out.println("Insira a temperatura máxima diária do(a) " + dias[i] + " ->");
			x[i] = teclado.nextDouble();
			media = media + x[i];
		}

		media = media / x.length;

		System.out.println("Média semanal: " + media);

		for (int i = 0; i < x.length; i++) {

			if (x[i] > media) {

				System.out.println("O dia esteve acima da média de temperatura semanal: " + dias[i]);
			}
		}

	}

}

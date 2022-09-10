import java.util.Random;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();

		int qtd;
		boolean achei;

		System.out.println("Quantos números--> ");
		qtd = teclado.nextInt();

		int[] x = new int[qtd];

		for (int i = 0; i < x.length;) {

			x[i] = gerador.nextInt(8);
			achei = false;
			for (int j = 0; j < i; j++) {

				if (x[i] == x[j]) {
					achei = true;
					break;
				}
			}
			
			if(achei==false) {
				
				System.out.print(x[i] + " ");
				i++;
			}


		}

	}

}

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int salas, alunos, cont = 1, i = 0;
		double res = 0, porc = 0, tot, j = 0;

		System.out.println("Insira o número de salas--> ");
		salas = teclado.nextInt();

		while (cont <= salas) {

			System.out.println("\nInsira o número de alunos da sala " + cont + "--> ");
			alunos = teclado.nextInt();

			int[] x = new int[alunos];

			while (i < alunos) {
				System.out.println("Insira as notas dos alunos da sala (entre 0 e 100)--> ");
				x[i] = teclado.nextInt();
				res += x[i];
				i++;

			}

			System.out.println("\nSoma das notas da sala--> " + res);
			cont++;
			porc = (res) / (alunos);
			System.out.println("\nMédia das notas da sala--> " + porc);

			for (int k = 0; k < x.length; k++) {
				
				if (x[k] > porc) {
					
					j++;
				}
			}
			porc = 0;
			i = 0;
			tot = ((j) / (alunos)) * 100;
			System.out.println("\nPorcentagem de alunos que estão acima da média da sala--> " + String.format("%.3f", tot) + "%");
			res = 0;
			j = 0;

		}

	}

}

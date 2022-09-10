import java.util.Scanner;

public class ex6metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int salas, cont = 1;
		double res = 0,porc = 0, tot = 0;
		int alunos = 0;

		

		System.out.println("Insira o número de salas--> ");
		salas = teclado.nextInt();

		while (cont <= salas) {

			System.out.println("\nInsira o número de alunos da sala " + cont + "--> ");
			alunos = teclado.nextInt();
			
			double [] x1 = new double [alunos];
			
			res = media (x1, res);

			System.out.println("\nSoma das notas da sala--> " + res);
			cont++;
			porc = (res) / (alunos);
			System.out.println("\nMédia das notas da sala--> " + porc);

			System.out.println("\nPorcentagem de alunos que estão acima da média da sala--> " + 
			String.format("%.3f",porcentagem(porc,tot,alunos,res,x1)) + "%");
			res =  0;
			porc = 0;
		}
		

		
		
		teclado.close();

	}

	public static double porcentagem(double porc, double tot, int alunos, double res, double [] x1) {
		
		
		double j = 0;
		
		for (int k = 0; k < x1.length; k++) {

			if (x1[k] > porc) {

				j++;
			}
		}
		tot = (j) / (alunos) * 100;
		return tot;
	}
	
	public static double media (double [] x1, double res) {
		
		Scanner teclado = new Scanner (System.in);
		int i = 0;
		while (i < x1.length) {
			System.out.println("Insira as notas dos alunos da sala (entre 0 e 100)--> ");
			x1[i] = teclado.nextInt();
			res += x1[i];
			i++;

		}
		return res;
		
		
	}
}
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
int[] x = new int [5];
int maior = 0, menor = 0;



for (int i=0; i<x.length;i++) {
	
	System.out.println("Insira um valor: ");
	x[i] = teclado.nextInt();

if (x[i] > maior || i == 0) {
	maior = x[i];
}

if (x[i] < menor || i == 0) {
	menor = x[i];
}


}	

System.out.println("Maior valor: " + maior);
System.out.println("Menor valor: " + menor);
	
	
	}

}

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
	
	int [] x = new int [5];
	int par =0, impar=0;
	
	
	
	for (int i = 0; i<x.length; i++) {
		
		System.out.println("Insira um valor: ");
		x[i] = teclado.nextInt();
	
		
		if(x[i] % 2 == 0) {
			
			par++;
		
		} else {
			
			impar++;
		}
		
	}
	
	System.out.println("Pares: " + par);
	System.out.println("Ímpares: " + impar);
	
	
	}

}

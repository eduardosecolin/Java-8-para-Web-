package unidade2;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerApp {

 private static Scanner teclado;
 private static Formatter saida;	
	public static void main(String[] args) {
		saida = new Formatter(System.out);
		teclado = new Scanner(System.in);
		System.out.println("Digite 4 notas");
		System.out.print("Nota 1: ");
		int n1 = Integer.parseInt(teclado.nextLine());
		System.out.print("Nota 2: ");
		int n2 = Integer.parseInt(teclado.nextLine());
		System.out.print("Nota 3: ");
		int n3 = Integer.parseInt(teclado.nextLine());
		System.out.print("Nota 4: ");
		int n4 = Integer.parseInt(teclado.nextLine());
		
		double resultado = (n1 + n2 + n3 + n4) / 4;
		saida.format("A media = %.2f", resultado);
		//System.out.println(resultado);
		teclado.close();
		saida.close();

	}

}

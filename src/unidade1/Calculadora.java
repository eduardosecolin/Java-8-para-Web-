package unidade1;

import java.util.Scanner;

public class Calculadora {
	private static Scanner teclado;

	public static void dividir(int n1, int n2) throws ArithmeticException{
		System.out.println("O Resultado é: " + n1/n2);
	}

	public static void main(String[] args) throws DivisaoZeroException{
		teclado = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int n1 = Integer.parseInt(teclado.nextLine());
		System.out.print("Digite um valor: ");
		int n2 = Integer.parseInt(teclado.nextLine());
		try{
			dividir(n1,n2);
		}catch(ArithmeticException e){
		   //throw new DivisaoZeroException();
		   System.out.println(e.getMessage());
		}

	}

}

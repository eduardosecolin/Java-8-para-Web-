package unidade2;

import java.io.FileInputStream;
import java.util.Scanner;

public class StreamApp {
	
	private static Scanner teclado;

	public static void byteStream() throws Exception{
		FileInputStream entrada = new FileInputStream("C:/Users/carlos/Desktop/"
				+ "Udemy/Java 8 para WEB/cursojava8/2Diciplina/src/unidade2/dados.txt");
		int contador = 0;
		while((entrada.read()) != -1){
			contador++;
		}
		System.out.println("O total de caracteres do texto é: " + contador);
		entrada.close();		
	}
	public static void caracterStream(char letra) throws Exception{
		FileInputStream entrada = new FileInputStream("C:/Users/carlos/Desktop/"
				+ "Udemy/Java 8 para WEB/cursojava8/2Diciplina/src/unidade2/dados.txt");
		int contador = 0;
		int c;
		while((c = entrada.read()) != -1){
			if(c == letra){
			contador++;
			}
		}
		System.out.println("O total da letra informada é: " + contador);
		entrada.close();		
	}

	public static void main(String[] args) {
	 teclado = new Scanner(System.in);	
		try{
			byteStream();
			System.out.println("");
			System.out.print("Informe a letra a ser encontrada: ");
			char letra = teclado.nextLine().charAt(0);
			caracterStream(letra);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

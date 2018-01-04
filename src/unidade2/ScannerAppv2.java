package unidade2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAppv2 {

	public static void main(String[] args) {
		try{
			Scanner teclado = new Scanner(new FileReader("C:/Users/carlos/Desktop/Udemy/Java 8 para WEB"
					+ "/cursojava8/2Diciplina/src/unidade2/numeros.txt"));
			double soma = 0;
			String valor;
			while(teclado.hasNext()){
				valor = teclado.next();
				soma += Double.parseDouble(valor);
			}
			teclado.close();
			JOptionPane.showMessageDialog(null, "A soma dos valores é = " + soma);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}

	}

}

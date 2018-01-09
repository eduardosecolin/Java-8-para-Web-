package unidade3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsoGernerico2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Login<String, String> iob = new Login<>("Eduardo", "@123");
		iob.showType();
		System.out.println(iob.toString());
		JOptionPane.showMessageDialog(null, iob.toString(),"Login",JOptionPane.CLOSED_OPTION);
		Integer[] vet = new Integer[2];
		 System.out.print("Digite a primeira nota: ");
		 vet[0] = Integer.parseInt(teclado.nextLine());
		 System.out.print("Digite a segunda nota: ");
		 vet[1] = Integer.parseInt(teclado.nextLine());
		Stats<Integer> st = new Stats<>(vet);
		System.out.println(st.mostrarMedia());

	}

}

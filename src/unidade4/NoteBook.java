package unidade4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NoteBook {

	private static List<String> anotacoes;
	private static List<String> anotacao;
	
	public static void main(String[] args) {
		anotacoes = new ArrayList<>();
		anotacoes.add("Comprar Pão");
		anotacoes.add("Vender Carro");
		anotacoes.add("Encontro as 9:00 hrs");
		double tempo1 = System.currentTimeMillis();
		for(int i = 3; i <= 1000; i++){
			anotacoes.add("Texto_"+i);
		}
		double tempo2 = System.currentTimeMillis();
		System.out.println((tempo1 - tempo2) / 1000);
        /*for(String item : anotacoes){
        	System.out.println(item);
        }*/
		anotacao = new LinkedList<>();
		anotacao.add("Comprar Pão");
		anotacao.add("Vender Carro");
		anotacao.add("Encontro as 9:00 hrs");
		double tempo3 = System.currentTimeMillis();
		for(int i = 3; i <= 1000; i++){
			anotacao.add("Texto_"+i);
		}
		double tempo4 = System.currentTimeMillis();
		System.out.println((tempo3 - tempo4) / 1000);
	}

}

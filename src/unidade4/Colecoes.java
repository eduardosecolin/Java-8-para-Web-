package unidade4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;
import java.util.Deque;

public class Colecoes {

	public static void main(String[] args) {
		Set<String> listaH = new HashSet<>();
		listaH.add("Vermelho");
		listaH.add("Verde");
		listaH.add("Verde");
		listaH.add("Amarelo");
		System.out.println(listaH);
		
		// ---------------------------------------------
		
		Set<String> listaL = new LinkedHashSet<>();
		listaL.add("Vermelho");
		listaL.add("Verde");
		listaL.add("Verde");
		listaL.add("Amarelo");
		System.out.println(listaL);
		
		// ---------------------------------------------
		
		Set<String> listaT = new TreeSet<>();
		listaT.add("Vermelho");
		listaT.add("Verde");
		listaT.add("Verde");
		listaT.add("Amarelo");
		System.out.println(listaT);
		
		// ---------------------------------------------
		
		List<String> listaA = new ArrayList<>();
		listaA.add("Vermelho");
		listaA.add("Verde");
		listaA.add("Verde");
		listaA.add("Amarelo");
		Collections.sort(listaA);
		System.out.println(listaA);
		
		// ---------------------------------------------
		
		LinkedList<String> listaLK = new LinkedList<>();
		listaLK.add("Vermelho");
		listaLK.add("Verde");
		listaLK.add("Verde");
		listaLK.add("Amarelo");
		listaLK.removeFirst();
		listaLK.removeLast();
		//Collections.sort(listaLK);
		System.out.println(listaLK);
		
		// ---------------------------------------------
		
		Deque<String> listaD = new ArrayDeque<>();
		listaD.add("Vermelho");
		listaD.add("Verde");
		listaD.add("Verde");
		listaD.add("Amarelo");
		listaD.removeFirst();
		listaD.removeLast();
		System.out.println(listaD);
		listaD.addFirst("Azul");
		listaD.addLast("Preto");
		System.out.println(listaD);
		System.out.println(listaD.peekFirst());
		System.out.println(listaD.peekLast());

	}

}

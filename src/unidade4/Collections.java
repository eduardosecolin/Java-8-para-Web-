package unidade4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class Collections {

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
		
	

	}

}

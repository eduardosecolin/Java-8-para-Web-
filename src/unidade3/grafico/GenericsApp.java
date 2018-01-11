package unidade3.grafico;

import java.util.ArrayList;
import java.util.List;

public class GenericsApp {

	public static void main(String[] args) {
		
		List<Shape> lista = new ArrayList<>();
		lista.add(new Circulo());
		lista.add(new Retangulo());
		
		Shape s = lista.get(1);
		System.out.println(s.getClass().getName());
		
		Shape s1 = lista.get(0);
		System.out.println(s1.getClass().getName());
		
		
		// A super classe de genericos pode receber uma lista de Strings?
		List<String> st = new ArrayList<>();
		List<?> list = st;
		// Resposta = " Sim "
		
		System.out.println(list.getClass().getName());
	}

}

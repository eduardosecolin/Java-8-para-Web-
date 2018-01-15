package unidade4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapApp {

	public static void main(String[] args) {
		HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Carlos Eduardo");
        mapa.put(2, "Roseli Secolin");
        mapa.put(3, "Patricia Secolin");
        mapa.put(3, "Maria Eduarda");
        mapa.put(4, "Eduardo Sernaglia");
        System.out.println(mapa);
        System.out.println("_________________________________________"+
                           "_________________________________________");
        
		Map<Integer, String> mapa1 = new LinkedHashMap<>();
        mapa1.put(4, "Carlos Eduardo");
        mapa1.put(2, "Roseli Secolin");
        mapa1.put(3, "Patricia Secolin");
        mapa1.put(3, "Maria Eduarda");
        mapa1.put(1, "Eduardo Sernaglia");
        System.out.println(mapa1);
        System.out.println("_________________________________________"+
                           "_________________________________________");
        
		Map<Integer, String> mapa2 = new TreeMap<>();
        mapa2.put(4, "Carlos Eduardo");
        mapa2.put(2, "Roseli Secolin");
        mapa2.put(3, "Patricia Secolin");
        mapa2.put(3, "Maria Eduarda");
        mapa2.put(1, "Eduardo Sernaglia");
        System.out.println(mapa2);
        System.out.println("_________________________________________"+
                           "_________________________________________");
	}

}

package unidade3.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exec1 {		
	
	List<Integer> lista;
	public Exec1(){
		this.lista = new ArrayList<>();
	}
	
	public void execAdd(int num){
	 if(num % 2 != 0){	
	  lista.add(num);
	 }
	}
	public List<Integer> execMostar(){
		for(Integer item : lista){
			System.out.println(item);
		}
		return lista;
	}
	

}

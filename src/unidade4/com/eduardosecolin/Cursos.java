package unidade4.com.eduardosecolin;

import java.nio.file.Path;

public class Cursos {
	public String nome;
	public int cdCurso;
	public float valor;
	public Path url;
	
	public Cursos(String nome, float valor, Path url) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.url = url;
	}


	/*
    private String nome;
    
    
    public Cursos(String nome){
    	this.nome = nome;
    }
    
    public String getNome(){
    	return this.nome;
    }
    public void setNome(String nome){
    	this.nome = nome;
    }
   */
@Override
public String toString() {
	return "Nome do curso: "+ nome;
                              
}
 
  
}

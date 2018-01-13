package unidade4.com.eduardosecolin;

public class Cursos {
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
   
@Override
public String toString() {
	return "Nome do curso: "+ nome;
                              
}
 
  
}

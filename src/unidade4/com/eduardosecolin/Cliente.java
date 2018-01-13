package unidade4.com.eduardosecolin;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private Set<Cursos> meuCurso;
    private Set<Curso> nossoCurso;
    
   public Set<Curso> getNossoCurso(){
	   return nossoCurso;
   }
   public void setNossoCurso(Set<Curso> curso){
	   this.nossoCurso = curso;
   }
    
   public Set<Cursos> getMeuCurso() {
		return meuCurso;
	}
	public void setMeuCurso(Set<Cursos> meuCurso) {
		this.meuCurso = meuCurso;
	}




public static void main(String[] args) {
	  Cursos curso1 = new Cursos("Ads");
	  Cursos curso2 = new Cursos("Projetos");
	  
	  Set<Cursos> aluno1 = new HashSet<>();
	  Set<Cursos> aluno2 = new HashSet<>();
	  Set<Curso> aluno3 = new HashSet<>();
	  Set<Curso> aluno4 = new HashSet<>();
	  
	  aluno1.add(curso1);
	  aluno1.add(curso2);
	  
	  aluno2.add(curso1);
	  
	  /*
	  // interseção
	  System.out.println("ALUNO 1 E ALUNO 2");
	  aluno1.retainAll(aluno2);
	  System.out.println(aluno1);
	  System.out.println("-------------------------------");
	  
	  // remoção
		  System.out.println("ALUNO 1 E ALUNO 2");
		  aluno1.removeAll(aluno2);
		  System.out.println(aluno1);
		  System.out.println("-------------------------------");
	  */
	  
	  
	  
	  aluno3.add(Curso.Ads);
	  aluno3.add(Curso.Projetos);
	  
	  aluno4.add(Curso.Gestão);
	  aluno4.add(Curso.Mecatronica);
	  aluno4.add(Curso.Ads);
	  
	 Cliente A = new Cliente();
	 A.setMeuCurso(aluno1);
	 Cliente B = new Cliente();
	 B.setMeuCurso(aluno2);
	 Cliente C = new Cliente();
	 C.setNossoCurso(aluno3);
	 Cliente D = new Cliente();
	 D.setNossoCurso(aluno4);
	 
	 System.out.println(A.getMeuCurso() + "\n" + B.getMeuCurso() + "\n" + 
	                    C.getNossoCurso() + "\n" + D.getNossoCurso());
	  
	  
	  
  } 
}

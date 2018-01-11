package unidade3.crud;

import unidade1.br.eduardosecolin.rh.Administrativo;
import unidade1.br.eduardosecolin.rh.Diretor;
import unidade1.br.eduardosecolin.rh.Professor;

public class CrudApp {

	public static void main(String[] args) {
		GenericDAO<Administrativo> admin = new GenericDAO<>();
		admin.create(new Administrativo());
		
		GenericDAO<Diretor> dir = new GenericDAO<>();
		dir.create(new Diretor());
		
		GenericDAO<Professor> prof = new GenericDAO<>();
		prof.create(new Professor());

	}

}

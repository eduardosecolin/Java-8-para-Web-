package unidade1;

import unidade1.br.eduardosecolin.Universidade;
//importando estaticamente
import static unidade1.br.eduardosecolin.Universidade.*;

public class Mec {
	public void avaliarEnsino(){
		Universidade u = new Universidade();
		u.getClass().getName();
	}

	public static void main(String[] args) {
		gerarRelatorioProfessoresMestresDoutores();
	}
}

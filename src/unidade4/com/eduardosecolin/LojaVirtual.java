package unidade4.com.eduardosecolin;

//import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LojaVirtual {
   
	//static Map<Cliente, List<Cursos>> pagamento = new HashMap<>();
	static Map<Cliente, List<Curso>> pagamento = new HashMap<>();
	
	public static void main(String[] args) {
		// Criar os cursos disponiveis no site para venda
		//Cursos ads = new Cursos("ADS", 2000, Paths.get("/ads"));
		//Cursos Projetos = new Cursos("PROJETOS", 2500, Paths.get("/projetos"));
		//Cursos Mecatrocica = new Cursos("MECATRONICA", 1500, Paths.get("/mecatronica"));
		
		// Cadastrar o cliente
		Cliente eduardo = new Cliente("Eduardo", "333.222.444 - 01", "eduardo@email.com");
		
		// Criar lista de cursos do cliente
		List<Curso> cursoEduardo = new LinkedList<>();
		
		// Fazer checkout dos cursos escolhidos
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		while(opcao != 4){
			System.out.println("Qual curso deseja adquirir?");
			System.out.println("1 - ADS");
			System.out.println("2 - PROJETOS");
			System.out.println("3 - MECATRONICA");
			System.out.println("4 - SAIR");
			System.out.print("Qual sua opção: ");
			opcao = teclado.nextInt();
			switch(opcao){
			case 1:
				cursoEduardo.add(Curso.Ads);
				break;
			case 2:
				cursoEduardo.add(Curso.Projetos);
				break;
			case 3:
				cursoEduardo.add(Curso.Mecatronica);
				break;
			case 4:	
				break;
			}
		}
		teclado.close();
		pagamento.put(eduardo, cursoEduardo);
		System.out.println(pagamento);
	}
	
}

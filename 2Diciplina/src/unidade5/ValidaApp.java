package unidade5;

public class ValidaApp {

	public static void main(String[] args) {
		
		String celular = "99113-4566";
		Validador<String> validacao = x -> x.matches("[0-9]{5}-[0-9]{4}");
		System.out.println(validacao.valida(celular));

	}

}

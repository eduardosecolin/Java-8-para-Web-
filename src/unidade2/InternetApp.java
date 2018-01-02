package unidade2;

// registrar o codigi que esta sendo feito com o @copyright que é uma anotação criada pelo desenvolvedor
@Copyright(autor = "Eduardo Secolin", data = "02/01/2018", versao = "1.0")
public class InternetApp implements Internet {
	
	// para o desenvolvedor não implementar o metodo obsoleto usa-se o @Deprecate
	@Deprecated
	public void conectar() {
	}

	@Override
	public void conectarSSL() {
		// TODO Auto-generated method stub

	}

}

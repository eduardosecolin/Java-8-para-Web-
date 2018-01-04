package unidade1;

public class DivisaoZeroException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2498000032330750939L;

	public static String mensagem(){
		return "Não pode ser dividido por zero!!!";
	}

}

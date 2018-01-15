package unidade1;

public class TesteExcecao {

	private static Object c;

	public static void main(String[] args) {
		try{
			int i = 50;
			i = i / 0;
			System.out.println(i);
			c = null;
			System.out.println(c.toString());
		}catch(ArithmeticException | NullPointerException e){
			e.printStackTrace();
		}
	}

}

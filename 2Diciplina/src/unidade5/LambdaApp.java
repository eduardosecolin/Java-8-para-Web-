package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

	public static int somatorio = 0;

	public static void main(String[] args) {

		List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5);
		inteiros.forEach(x -> {
			int y = x / 2;
			LambdaApp.somatorio += x;
			System.out.println(y);
		});

		System.out.println(LambdaApp.somatorio);
	}

}

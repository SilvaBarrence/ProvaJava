package desafio;

import java.util.Random;

public class MainPrimos {

	public static void main(String[] args) {

		Random random = new Random();
		int num = random.nextInt(100);
		int contador = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contador++;
			}
		}
		if (contador == 2 || num == 2) {
			System.out.println("O n�mero " + num + " � primo!");
		} else {
			System.out.println("O n�mero " + num + " n�o � primo!");
		}

	}

}

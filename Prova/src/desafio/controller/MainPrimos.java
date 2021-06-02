package desafio.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import desafio.models.Hidroaviao;
import desafio.models.Pessoa;

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
			System.out.println("O número " + num + " é primo!");
		} else {
			System.out.println("O número " + num + " não é primo!");
		}

		System.out.println("\n==========\n");
		
		Hidroaviao hidro = new Hidroaviao();
		hidro.ligar();
		hidro.levantarVoo();
		hidro.pousar();
		hidro.desligar();
		
		System.out.println("\n==========\n");
		
		Pessoa p1 = new Pessoa("Fulano", "Silva", "29/05", "11900000000");
		Pessoa p2 = new Pessoa("Ellen", "Souza", "01/05", "11900000000");
		Pessoa p3 = new Pessoa("Gabriel", "Barrence", "06/05", "11900000000");
		
		Map<Integer, String> pessoa = new HashMap<>();
		pessoa.put(2, p1.getNome());
		pessoa.put(1, p2.getNome());
		pessoa.put(3, p3.getNome());
		
		System.out.println(pessoa);
		
	}

}

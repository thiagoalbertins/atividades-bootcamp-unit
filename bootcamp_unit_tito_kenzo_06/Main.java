package bootcamp_unit_tito_kenzo_06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		
		String frase = s.nextLine();
		
		maiorPalavra(frase);

		s.close();
	}
	
	private static void maiorPalavra(String frase) {
		String[] palavras = frase.split(" ");
		int i_maior = 0;
		int maior = 0;
		for (int i = 1; i < palavras.length; i++) {
			if (palavras[i].length()>maior){
				i_maior = i;
				maior = palavras[i].length();
			}
		}
		System.out.println("Maior palavra = " + palavras[i_maior]);
	}

}

package bootcamp_unit_tito_kenzo_03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite uma frase:");
		
		Scanner s = new Scanner(System.in);
		
		String frase = s.nextLine();
		
		quantidade(frase);
		
		s.close();
	}
	

	private static void quantidade(String frase) {
		System.out.println(frase);
		String[] letras = frase.split("");
		int contador = 0;
		for (int i = 0; i < letras.length; i++) {
			if (letras[i].contains("a") || letras[i].contains("A")) {
				contador++;
			}
		}
		System.out.println("TOTAL DE A = "+contador);
	}
}


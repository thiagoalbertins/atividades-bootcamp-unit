package bootcamp_unit_tito_kenzo_04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite uma frase:");
		
		Scanner s = new Scanner(System.in);
		
		String frase = s.nextLine();
		
		String frase_corr = frase.trim().replaceAll(" +", " ");
		
		quantidade(frase_corr);
		
		s.close();
	}
	

	private static void quantidade(String frase) {
		System.out.println(frase);
		String[] letras = frase.split(" ");
		System.out.println("TOTAL DE PALAVRAS = "+letras.length);
	}
}
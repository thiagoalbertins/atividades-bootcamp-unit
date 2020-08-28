package bootcamp_unit_tito_kenzo_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		
		double n = s.nextDouble();

		System.out.println(sequencia(n));
		s.close();
	}

	public static double sequencia(double N) {
		double A = N + 1/N;
		for (int i = 1; i < (N-1); i++) {
			double termo = (N-i)/(i+1);
			A = A + termo;
		}
		return A;
	}
}


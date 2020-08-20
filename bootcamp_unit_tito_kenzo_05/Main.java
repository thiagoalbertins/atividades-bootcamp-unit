package bootcamp_unit_tito_kenzo_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite um número:");
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		fibonacci(N);
		s.close();
	}

	private static void fibonacci(int N) {
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(1);
		x.add(1);
		for (int i = 2; i < N; i++) {
			
			int anterior1 = x.get(i-1);
			int anterior2 = x.get(i-2);
			int proximo = anterior1 + anterior2;
			x.add(proximo);
			
		}
		for (int i = 0; i < x.size(); i++) {
			
			System.out.print(x.get(i) + " ");
		}
	}
}

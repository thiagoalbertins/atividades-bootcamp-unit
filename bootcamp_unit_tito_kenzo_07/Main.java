package bootcamp_unit_tito_kenzo_07;

public class Main {

	public static void main(String[] args) {
		
		fatorial();

	}

	private static int somaPares(int[] x) {
		int soma = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i]%2==0) {
				soma = soma+x[i];
			}
		}
		return soma;
	}
	
	private static int somaImpares(int[] x) {
		int soma = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i]%2!=0) {
				soma = soma+x[i];
			}
		}
		return soma;
	}
	
	private static void fatorial() {
		int[]x = new int[50];
		for (int i = 0; i < x.length; i++) {
			x[i] = i+1;
		}
		int resultado = somaPares(x)-somaImpares(x);
		int result = 1;
		for (int i = 1; i <= resultado; i++) {
			result = result * i;
		}
		System.out.println(result);
	
	}
	
}

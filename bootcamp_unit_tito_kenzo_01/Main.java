package bootcamp_unit_tito_kenzo_01;

public class Main {

	public static void main(String[] args) {
		double resultado = 0;
		double qnt;
		for (int i = 0; i < 64; i++) {
			qnt = Math.pow(2, i);
			resultado = resultado + qnt;
			System.out.println("Casa: " + (i+1) + " - Qtd: " + qnt + " - Soma: " + resultado);
		}

	}

}

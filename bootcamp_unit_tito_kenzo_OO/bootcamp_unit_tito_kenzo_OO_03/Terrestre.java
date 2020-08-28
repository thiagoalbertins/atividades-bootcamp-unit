package bootcamp_unit_tito_kenzo_OO_03;

public class Terrestre extends MeioDeTransporte{

	private int qtdeRodas;
	private double potencia;
	
	public double consumo() {
		return this.potencia*this.carga_maxima*100;
	}
}

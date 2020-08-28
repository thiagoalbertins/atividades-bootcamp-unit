package bootcamp_unit_tito_kenzo_OO_01;

public class Transporte {

	private Integer id, ano;
	private String modelo;
	private Double carga_maxima, potencia;
	
	public Transporte() {
		
	}

	public Transporte(Integer id, Integer ano, String modelo, Double carga_maxima, Double potencia) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
		this.potencia = potencia;
	}
	
	public Double consumo() {
		return this.potencia * this.carga_maxima * 100;
	}
	
	public String leiaModelo() {
		return this.modelo;
	}
	
	public void gravaModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}

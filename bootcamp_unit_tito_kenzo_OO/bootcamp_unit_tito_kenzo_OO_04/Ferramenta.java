package bootcamp_unit_tito_kenzo_OO_04;

public class Ferramenta extends ItemDeLoja{

	private String categoria;
	private Integer serial;
	
	@Override
	public int getIdentificador() {
		return this.serial;
	}
	
	public void separar() {
		this.categoria = "Outro";
	}
	
	public void separar(String valor) {
		this.categoria = valor;
	}
}

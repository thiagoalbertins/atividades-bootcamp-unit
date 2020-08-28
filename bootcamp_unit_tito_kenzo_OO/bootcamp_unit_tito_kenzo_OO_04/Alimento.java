package bootcamp_unit_tito_kenzo_OO_04;

public class Alimento extends ItemDeLoja{

	private Integer selo;
	
	@Override
	public int getIdentificador() {
		return this.selo;
	}
}

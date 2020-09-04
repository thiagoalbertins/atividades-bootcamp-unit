
public class Almanaque extends Livro {

	private int paginaAtual, totalPaginas;
	private boolean aberto;
	
	public Almanaque() {
		super();
	
	}

	public Almanaque(String titulo, String autor, int totalPaginas, Pessoa pessoa) {
		super(titulo, autor, totalPaginas, pessoa);
		this.aberto = false;
		this.paginaAtual = 0;
	}

	@Override
	public String detalhes() {
		// TODO Auto-generated method stub
		return super.detalhes();
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		super.abrir();
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		super.fechar();
	}

	@Override
	public void folhear(int pagina) {
		if (super.aberto == true) {
			if (super.paginaAtual == 2) {
				if (pagina <  super.totalPaginas && pagina > 0) {
					super.paginaAtual = pagina;
				}
				else {
					System.out.println("Página inválida!");
				}
			}
		}
		else {
			System.out.println("Almanaque fechado, favor abrir");
		}
	}

	@Override
	public void avancar() {
		if (super.aberto == true) {
			if (super.paginaAtual + 2 <= super.totalPaginas) {
				super.paginaAtual += 2;
			}
			else {
				System.out.println("Almanaque chegou ao fim!");
			}
		}
		else {
			System.out.println("Almanaque fechado, favor abrir.");
		}

	}

	@Override
	public void voltarPagina() {
		if (super.aberto == true) {
			if (super.paginaAtual>2) {
				super.paginaAtual -= 2;
			}
			else {
				System.out.println("Impossível voltar página.");
			}
		}
		else {
			System.out.println("Almanaque fechado, favor abrir.");
		}

	}


}


public class Livro implements Publicacao {

	protected String titulo, autor;
	protected int totalPaginas, paginaAtual;
	protected boolean aberto;
	protected Pessoa pessoa;

	public Livro() {
		super();
	}

	public Livro(String titulo, String autor, int totalPaginas, Pessoa pessoa) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginaAtual = 0;
		this.aberto = false;
		this.pessoa = pessoa;
	}
	
	public Livro(String titulo, String autor, int totalPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginaAtual = 0;
		this.aberto = false;
	}

	public String detalhes() {
		return this.titulo + "," + this.autor + "," + this.totalPaginas + "," + this.paginaAtual + "," + this.aberto
				+ "," + this.pessoa.getNome();
	}

	@Override
	public void abrir() {
		this.aberto = true;

	}

	@Override
	public void fechar() {
		this.aberto = false;

	}

	@Override
	public void folhear(int pagina) {
		if (this.aberto == true) {
			if (pagina <  this.totalPaginas && pagina >= 0) {
				this.paginaAtual = pagina;
			}
			else {
				System.out.println("Página inválida!");
			}
		}
		else {
			System.out.println("Livro fechado, favor abrir.");
		}

	}

	@Override
	public void avancar() {
		if (this.aberto == true) {
			if (this.paginaAtual + 1 <= this.totalPaginas) {
				this.paginaAtual += 1;
			}
			else {
				System.out.println("Livro chegou ao fim!");
			}
		}
		else {
			System.out.println("Livro fechado, favor abrir.");
		}

	}

	@Override
	public void voltarPagina() {
		if (this.aberto == true) {
			if (this.paginaAtual>0) {
				this.paginaAtual -= 1;
			}
			else {
				System.out.println("Impossível voltar página.");
			}
		}
		else {
			System.out.println("Livro fechado, favor abrir.");
		}

	}

}

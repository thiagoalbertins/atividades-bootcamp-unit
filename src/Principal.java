
public class Principal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Luis", "M", 27);
		Pessoa p2 = new Pessoa("Jana", "F", 23);
		
		Livro l1  = new Livro("As Cronicas de Narnia", "CS Lewis", 250, p1);
		Livro l2  = new Livro("O Pequeno Principe", "Antoine de Saint-Exupery", 100, p1);
		Livro l3  = new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", 800, p2);
		
		Almanaque a1 = new Almanaque("Turma da Mônica", "Maurício de Souza", 99, p2);
		Almanaque a2 = new Almanaque("Quadrinhos Marvel", "Stan Lee", 50, p2);
		
		System.out.println(l1.detalhes());
		System.out.println(l2.detalhes());
		System.out.println(l3.detalhes());
		System.out.println(a1.detalhes());
		System.out.println(a2.detalhes());
		
	
		l1.abrir();
		l1.avancar();
		l1.folhear(97);
		l1.avancar();
		l1.voltarPagina();
	
		l2.abrir();
		l2.avancar();
		l2.folhear(80);
		l2.avancar();
		l2.voltarPagina();
		l2.fechar();
		
		l3.abrir();
		l3.avancar();
		l3.folhear(700);
		l3.avancar();
		l3.voltarPagina();

		a1.abrir();
		a1.avancar();
		a1.folhear(97);
		a1.avancar();
		a1.voltarPagina();
		a1.fechar();
		
		a2.abrir();
		a2.avancar();
		a2.folhear(36);
		a2.avancar();
		a2.voltarPagina();
		
		System.out.println(l1.detalhes());
		System.out.println(l2.detalhes());
		System.out.println(l3.detalhes());
		System.out.println(a1.detalhes());
		System.out.println(a2.detalhes());
	}

}

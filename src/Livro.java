import java.math.BigDecimal;

public class Livro {

	private String tituloLivro;
	private String resumo;
	private String sumario;
	private String isbn;
	private Integer numeroPaginas;
	private Autor  autor;
	private Categoria categoria;
	private Integer edicao;
	private BigDecimal preco;
	
	
	public Livro(String tituloLivro , String resumo, String sumario,  String isbn, Integer numeroPaginas, Autor autor, Categoria categoria,
			Integer edicao, BigDecimal preco) {
		
		setTituloLivro(tituloLivro);
		setResumo(resumo);
		setSumario(sumario);
		setIsbn(isbn);
		setNumeroPaginas(numeroPaginas);
		setAutor(autor);
		setCategoria(categoria);
		setEdicao(edicao);
		setPreco(preco);
		
		
	}


	public void setTituloLivro(String tituloLivro) {
		
		if( tituloLivro == null || tituloLivro.isEmpty())
			throw new IllegalArgumentException("O titulo do livro não pode ser vazio");
			
		this.tituloLivro = tituloLivro;
	
	}

	public String getTituloLivro() {
		return tituloLivro;
	}
	

	public void setResumo(String resumo) {
		
		if(resumo == null || resumo.isEmpty()) 
			throw new IllegalArgumentException("O resumo do Livro não pode ser vazio");	
		
		if(resumo.length() < 500 ) 
			throw new IllegalArgumentException("O resumo do Livro não pode ter mais que 500 caractéres");	
		
			this.resumo = resumo;
	}

	public void setSumario(String sumario) {
		if(sumario == null || sumario.isEmpty())
			throw new IllegalArgumentException("O sumário não pode ser vazio!!!");
		this.sumario = sumario;
	}
	



	public void setIsbn(String isbn) {
		if(isbn == null  || isbn.isEmpty()) 
			throw new IllegalArgumentException("O ISBN não pode ser Vazio ");
		
		if(!isbn.matches("978"));
			
		if(!isbn.matches("\\d{3}-\\d{2}-\\d{5}-\\d{2}-\\d{1}"))
			throw new IllegalArgumentException("O número do ISBN está inválido por favor tente novamente !!! ");
			this.isbn = isbn;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		if(numeroPaginas == null || numeroPaginas <= 0)
			throw new IllegalArgumentException("O número de páginas do Livro deve ser maior que ZERO!!!");
		
		this.numeroPaginas = numeroPaginas;
	}

	 
	public void setAutor(Autor autor) {
		
		if(autor  == null)
			throw new IllegalArgumentException("O Autor não pode ser nulo");
			
		this.autor = autor;
	}


	public void setCategoria(Categoria categoria) {
		
		if(categoria == null)
			throw new IllegalArgumentException("A categoria não pode ser vazia ou nula.");
		this.categoria = categoria;
	}



	public void setEdicao(Integer edicao) {
		
		if(edicao == null || edicao <= 0 )
			throw new IllegalArgumentException("A edicao do Livro deve ser maior igual a um");
		this.edicao = edicao;
	}




	public void setPreco(BigDecimal preco) {
		
		if(preco == null || preco.doubleValue() < 0)
			throw new IllegalArgumentException("O preco do Livro não pode ser menor que ZERO!!");
		this.preco = preco;
	}

	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((edicao == null) ? 0 : edicao.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((numeroPaginas == null) ? 0 : numeroPaginas.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((resumo == null) ? 0 : resumo.hashCode());
		result = prime * result + ((sumario == null) ? 0 : sumario.hashCode());
		result = prime * result + ((tituloLivro == null) ? 0 : tituloLivro.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (edicao == null) {
			if (other.edicao != null)
				return false;
		} else if (!edicao.equals(other.edicao))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (numeroPaginas == null) {
			if (other.numeroPaginas != null)
				return false;
		} else if (!numeroPaginas.equals(other.numeroPaginas))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (resumo == null) {
			if (other.resumo != null)
				return false;
		} else if (!resumo.equals(other.resumo))
			return false;
		if (sumario == null) {
			if (other.sumario != null)
				return false;
		} else if (!sumario.equals(other.sumario))
			return false;
		if (tituloLivro == null) {
			if (other.tituloLivro != null)
				return false;
		} else if (!tituloLivro.equals(other.tituloLivro))
			return false;
		return true;
	}

	
	
}
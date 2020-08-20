
public class Categoria {
	
	private String nome;

	
	public Categoria(String nome) {
		setNome(nome);
	}
	



	private void setNome(String nome) {
		if(nome == null || nome.isEmpty())
			throw new IllegalArgumentException("O nome da categoria nao pode ser vazio!!");
			
			this.nome = nome;
			
	}


	public String getNome() {
		return nome;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nome.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;

        Categoria comparacao = (Categoria) obj;
        return this.nome.equals(comparacao.nome);
	}

    @Override
    public String toString() {
        return "Categoria [name=" + nome + "]";
    }
}
	
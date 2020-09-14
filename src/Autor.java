
public class Autor {
		private String nome;
		private String email;
		
		public Autor(String nome, String email) {
			setNome(nome);
			setEmail(email);
		}

		private void setNome(String nome) {
			if (nome == null || nome.isEmpty())
				throw new IllegalArgumentException("o nome nao pode ser vazio ou nulo!");
			this.nome = nome;
			
		}


		private void setEmail(String email) {
			if(email == null || email.isEmpty())
				throw new IllegalArgumentException("o email não pode ser vazio ou nulo!");
			
			if( !(email.matches("^([\\w-]\\.?)+@([\\w-]+\\.)+([A-Za-z]{2,4})+$")))
	            throw new IllegalArgumentException("O formato do email não é valido!");
			
				//System.out.println("Email válido");
			
			this.email = email;
			
		}
		
		
	    @Override
	    public String toString() {
	        return "Autor [nome=" + nome + ", email=" + email + "]";
	    }

	    @Override
	   public int hashCode() {
	        final int prime = 31;
	       int result = 1;
	        result = prime * result + email.hashCode();
	       return result;
	  }

	    @Override
	    public boolean equals(Object obj) {
	        if(obj.getClass() != this.getClass()) return false;
	        if(this == obj) return true;

	        Autor comparado = (Autor) obj;
	        return this.email.equals(comparado.email);
	   }
}

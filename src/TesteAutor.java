
public class TesteAutor {
	public static void main(String[] args) {
		
		Autor teste1 = new Autor();
		Autor teste2 = new Autor();
		Autor teste3 = new Autor();
		Autor teste4 = new Autor();
		
		
		
		try {
			System.out.println("testando o nome do autor pra ver se não é nulo");
			teste1.setNome(null);
			teste1.setEmail(" ");
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage() + "\n");
			
		}
		
			
			try {
				
			}catch(IllegalArgumentException error){
			System.out.println(error.getMessage() + "\n");
			}

			try{
				System.out.println("testando nome para verificar se é vazio");
				teste2.setNome("");
				teste2.setEmail("teste@gmail.com");
			}catch(IllegalArgumentException error){
				System.out.println(error.getMessage() + "\n");
			}

			try{
				System.out.println("testando email para verificar se é vazio");
				teste3.setNome("Suelen");
				teste3.setEmail("");
			}catch(IllegalArgumentException error)
			{
				System.out.println(error.getMessage() + "\n");
			}
			
			try {
				System.out.println("Testando email para ver se é válido");
				teste4.setNome("Suelen");
				teste4.setEmail("suelenaparecida@caelum.com.br");
			}catch(IllegalArgumentException error) {
				System.out.println(error.getMessage() + "\n");
			}

		}

}

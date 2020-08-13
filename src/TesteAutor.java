
public class TesteAutor {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("testando o nome do autor pra ver se não é nulo");
			new Autor(null, "");
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage() + "\n");
			
		}
		
			
			try {
				
			}catch(IllegalArgumentException error){
			System.out.println(error.getMessage() + "\n");
			}

			try{
				System.out.println("testando nome para verificar se é vazio");
				new Autor("" , "teste@gmail.com");
			}catch(IllegalArgumentException error){
				System.out.println(error.getMessage() + "\n");
			}

			try{
				System.out.println("testando email para verificar se é vazio");
				new Autor("Suelen" , "");
			}catch(IllegalArgumentException error)
			{
				System.out.println(error.getMessage() + "\n");
			}
			
			try {
				System.out.println("Testando email para ver se é válido");
				new Autor("Suelen" , "suelen@gmail");
			}catch(IllegalArgumentException error) {
				System.out.println(error.getMessage() + "\n");
			}

		}

}

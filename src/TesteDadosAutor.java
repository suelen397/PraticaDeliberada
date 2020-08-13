
public class TesteDadosAutor {
	public static void main(String[] args) {
		
		DadosAutor testeDadosAutor = new DadosAutor();
		
		System.out.println("Testando o salvamento do autor cadastrado");

		Autor suelen = new Autor("suelen", "suelen.aparecida@caelum.com");
		
		Autor wanderson = new Autor("wanderson", "suelen.aparecida@caelum.com");
		
		
		try {
			testeDadosAutor.save(wanderson);
			System.out.println("");
		} catch (IllegalArgumentException error) {
				System.out.println(error.getMessage());
		}
		try {
			testeDadosAutor.save(suelen);
			System.out.println("");
		} catch (IllegalArgumentException error) {
				System.out.println(error.getMessage());
		}

		
	}
}

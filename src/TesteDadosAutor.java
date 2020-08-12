
public class TesteDadosAutor {
	public static void main(String[] args) {
		
		DadosAutor testeDadosAutor = new DadosAutor();
		
		System.out.println("Testando o salvamento do autor cadastrado");

		Autor suelen = new Autor();
		
		Autor wanderson = new Autor();
		
		
		suelen.setNome("suelen");
		suelen.setEmail("suelen.aparecida@caelum.com");
		
		wanderson.setNome("wanderson");
		wanderson.setEmail("suelen.aparecida@caelum.com");
		
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

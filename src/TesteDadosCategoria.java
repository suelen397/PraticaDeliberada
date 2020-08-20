
public class TesteDadosCategoria {
	public static void main(String[] args) {
		DadosCategoria TesteDadosCategoria = new DadosCategoria();
		
		System.out.println("Testando o salvamento da categoria");
		

		Categoria terror = new Categoria("terror");
		
		Categoria romance  = new Categoria("romance");
		
		
		try {
			TesteDadosCategoria.save(terror);
			System.out.println("");
		} catch (IllegalArgumentException error) {
				System.out.println(error.getMessage());
		}
		try {
			TesteDadosCategoria.save(romance);
			System.out.println("");
		} catch (IllegalArgumentException error) {
				System.out.println(error.getMessage());
		}

	}
}

import java.util.HashSet;
import java.util.Set;


public class DadosLivros {
	private static 	Set<Livro> livros = new HashSet<>();

	public void save(Livro livro) {
		
		if((DadosLivros.livros.add(livro)) ){
			System.out.println("Livro Cadastrado Com Sucesso No Sistema");
		} else {
			throw new RuntimeException("Esse Livro ja é cadastrado no Sistema");
		}
			

			
	
		
	}
			
		
	}


			

		



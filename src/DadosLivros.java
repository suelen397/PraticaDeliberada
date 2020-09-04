import java.util.HashSet;
import java.util.Set;


public class DadosLivros {
	private static 	Set<Livro> livros = new HashSet<>();

	public void save(Livro livro) {
		
		if((DadosLivros.livros.add(livro)) ){
			throw new IllegalArgumentException("Livro Cadastrado Com Sucesso No Sistema");
		} else {
			throw new IllegalArgumentException("Esse Livro ja é cadastrado no Sistema");
		}
			

			
	
		
	}
			
		
	}


			

		



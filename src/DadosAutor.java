import java.util.HashSet;
import java.util.Set;

public class DadosAutor {
	private static Set<Autor> autores = new HashSet<>();
	
	public void save(Autor autor) {
		if (!(DadosAutor.autores.add(autor)) ) {
			throw new IllegalArgumentException("Esse email já é cadastrado");
			
	
		}
	}

}

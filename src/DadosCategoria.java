import java.util.HashSet;
import java.util.Set;

public class DadosCategoria {
	private static Set<Categoria> categorias = new HashSet<>();
	
	public void save(Categoria categoria) {
		if(!(DadosCategoria.categorias.add(categoria)) ) {
			throw new IllegalArgumentException("Essa Categoria já existe");
		}
	}
}

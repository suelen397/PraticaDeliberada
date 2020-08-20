
public class TestaCategoria {
	public static void main(String[] args) {

		
		try{
			System.out.println("testando nome para verificar se é vazio");
			new Categoria("");
		}catch(IllegalArgumentException error){
			System.out.println(error.getMessage() + "\n");
		}
	try{
		System.out.println("testando nome para verificar se é vazio");
		new Categoria("Terror");
	}catch(IllegalArgumentException error){
		System.out.println(error.getMessage() + "\n");
	}
}
	
	

}

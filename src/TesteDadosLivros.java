import java.math.BigDecimal;

public class TesteDadosLivros{
	public static void main(String[] args) {
		
		String resumoLivro = "LoLorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla venenatis, ante sed pulvinar consectetur, risus est feugiat ipsum, in facilisis tortor velit rhoncus erat. Integer ligula nibh, rutrum efficitur quam at, interdum commodo sem. Phasellus ligula ligula, dapibus id sollicitudin nec, cursus et nisl. Nam rhoncus aliquet nibh, in tempus ipsum lacinia non. Duis eget eros tincidunt, consequat sem nec, faucibus arcu. In gravida finibus velit, ac venenatis mi ultricies ac. Morbi eros nisl, sodales vitae risus sit amet, egestas consectetur odio. Nullam ut nisi lacus. Aenean vel dapibus sapien. Aliquam tempus ornare lacus, porttitor aliquam sapien ornare vitae. Nam justo sapien, commodo vel elit mattis, mollis tempor lorem. Aenean mi nibh, gravida eget arcu at, faucibus finibus nunc. Quisque facilisis ligula in lacinia pharetra.duis ac auctor leo. Integer efficitur, lectus non laoreet lacinia, tellus nulla elementum odio, malesuada gravida nunc massa nec dolor. Suspendisse tempus tortor quis magna mattis, ac efficitur ipsum dapibus. Etiam molestie, nisl ut consectetur varius, justo purus volutpat ligula, et hendrerit arcu justo eget nisi. Ut placerat diam eget quam faucibus tincidunt. Nulla scelerisque mauris eu ante convallis porta. Nullam elementum nec odio rutrum placerat. Nam pellentesque tortor pulvinar eros placerat, eget tincidunt tortor semper. Nullam sodales sit amet massa ac porttitor. Sed luctus sed ante vel dictum. In lacinia nibh non tincidunt facilisis. In hac habitasse platea dictumst. In";
		
		DadosLivros testeDadosLivros = new DadosLivros();		
		
		System.out.println("Testando o Salvamneto do Livro já cadastrado");
		
		Livro harryPotter = new Livro("Harry Potter : E A Pedra Filosofal", resumoLivro, "1- O menino Que sobreviveu", "978-10-12314-12-1", 100 , new Autor("JK.ROWLING", "jk.rowling@gmail.com") , new Categoria("Ficcao"), 1 , new BigDecimal(35.90));
	
		
		try {
			testeDadosLivros.save(harryPotter);
			System.out.println("");
		} catch (IllegalArgumentException error) {
				System.out.println(error.getMessage());
		}
		
	try {
			testeDadosLivros.save(harryPotter);
			System.out.println("");
		} catch (IllegalArgumentException error) {
				System.out.println(error.getMessage());
		}
	}
}




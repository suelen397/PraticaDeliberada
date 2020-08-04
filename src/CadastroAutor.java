import java.util.Scanner;
public class CadastroAutor {
		    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        String nome;
	        String email;

	        System.out.printf("Infome o nome do Autor..........: ");
	        nome = ler.nextLine();

	        System.out.printf("Infome o Email do Autor..........: ");
	        email = ler.nextLine();

	        System.out.print("Nome do Autor = ");
	        System.out.println(nome);
	        System.out.print("Email do Autor = ");
	        System.out.println(email);
	    }
	}


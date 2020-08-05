public class CadastroAutor {
		   public static void main(String[] args) {
	  
	       String nomeUsuario1 ="Suelen";
	       String emailUsuario1 = "suelenaparecida@gmail.com";
	    		   
	       Autor usuario1 = new Autor(nomeUsuario1 , emailUsuario1);
	       Autor usuario2 = new Autor();
	       
	       usuario2.setNome("Caian");
	       usuario2.setEmail("caian@gmail.com");
	       
	        System.out.println("nome do autor 1: " + usuario1.getNome());
	        System.out.println("email do autor 1: " + usuario1.getEmail());
	        
	        System.out.println("nome do autor 2:" + usuario2.getNome());
	        System.out.println("nome do autor 2:" + usuario2.getEmail());
	    }
	}
package imersaoAlura;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;


public class App {	

    public static void main(String[] args) throws Exception {

        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        // Extrair dados (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        
        //Criar diretorio
        var diretorio = new File("figurinhas/");
        diretorio.mkdir();
        
        // Gerador de figurinhas
        var geradora = new GeradorDeFigurinhas();

        // Exibir e manipular os dados 
        for (Map<String,String> filme : listaDeFilmes) {
    	  String urlImagem = filme.get("image");
          String titulo = filme.get("title");
          InputStream inputStream = new URL(urlImagem).openStream();
          String nomeArquivo = "figurinhas/" + titulo + ".png";

              
          System.out.println("\u001b[1mTitulo:\u001b[m " + filme.get("title"));
          System.out.println("\u001b[1mImagem:\u001b[m " + filme.get("image"));
          System.out.println("\u001b[1mimDbRating:\u001b[m " + filme.get("imDbRating"));
            
          double numStars = Double.parseDouble(filme.get("imDbRating"));
          int numStarsInt = (int) numStars;
            
            if (numStarsInt<=6) {
                geradora.criarFigurinhas(inputStream, nomeArquivo, "POUCO-RECOMENDADO");
                System.out.print("Avaliação menor ou igual a  6:  👎");
            } else  {
                geradora.criarFigurinhas(inputStream, nomeArquivo, "FILMÃO");
		        	for (int i = 0; i <=numStarsInt; i++) {
		        		System.out.print("🍿");
		        	}
            } 
          System.out.println("\n");      
        }
    }
}
	

package imersaoAlura;

import java.net.URI;
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

        // Exibir e manipular os dados 
        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println("\u001b[1mTitulo:\u001b[m " + filme.get("title"));
            System.out.println("\u001b[1mImagem:\u001b[m " + filme.get("image"));
            System.out.println("\u001b[1mimDbRating:\u001b[m " + filme.get("imDbRating"));
            double numStarts = Double.parseDouble(filme.get("imDbRating"));
            int numStartsInt = (int) numStarts;
            
            if (numStartsInt<6) {
                	System.out.print("👎");
            } else  {
            	for (int i = 0; i <=numStartsInt; i++) {
        		System.out.print("🍿");
		}
            }
            System.out.println("\n");      
        }
    }
}
	

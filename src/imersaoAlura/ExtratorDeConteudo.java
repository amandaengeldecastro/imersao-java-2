package imersaoAlura;

import java.util.List;

public interface ExtratorDeConteudo {
		
    List<Conteudo> extraiConteudos(String json);
	
}

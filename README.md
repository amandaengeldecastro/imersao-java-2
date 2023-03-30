# Imersão Java
Este repositório contém os desafios da segunda edição da [Imersão Java da Alura](https://grupoalura.notion.site/Imers-o-Java-2-Edi-o-Guia-do-Mergulho-69e40005601f4d089a9add98251197de) [27 a 31 de março].
Código de referência [aqui](https://github.com/alura-cursos/imersao-java-2/tree/aula3)

## [Desafio 1]
1. Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares;
2. Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais;
3. Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente. 

## [Desafio 2]
1. Criar diretório de saída das imagens, se ainda não existir;
2. Centralizar o texto na figurinha;
3. Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes;
4. Colocar contorno (outline) no texto da imagem; 
5. Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha e fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.

## [Desafio 3]
1. Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16;
2. Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP;
3. Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra;
4. Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado. 

## [Desafio 4]
1. Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
2. Devolver a listagem ordenada pelo ranking; 
3. Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST.

## [Links úteis]
1. Documentação do pacote [javax.imageio](https://www.imdb.com/chart/top/), que trata de leitura e escrita de imagens;
2. Documentação da API do [IMDB](https://imdb-api.com/api);
3. Instalação do Visual Studio Code com o [Coding Pack](https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java) para Java;
4. Documentação da classe [HttpRequest do pacote java.net.http](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html);
5. Classe pronta que utiliza Expressões Regulares para fazer [parse de um JSON](https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3);
6. Biblioteca [Jackson](https://github.com/FasterXML/jackson), que faz parse de JSON;
7. [Site](https://regex101.com/) que ajuda a entender Expressões Regulares;
8. Artigo: [Como deixar no seu GitHub com um README interessante](https://www.alura.com.br/artigos/escrever-bom-readme);
9. O endpoint da API do IMDB que devolve os 250 melhores filmes: [https://imdb-api.com/en/API/Top250Movies/](https://imdb-api.com/en/API/Top250Movies/) + SUA-API-KEY;
10. Artigo na Alura [“O que é JSON?”](https://www.alura.com.br/artigos/o-que-e-json);
11. Artigo na Alura sobre como [pintar o terminal, com tabelinha de cores e negrito](https://www.alura.com.br/artigos/decorando-terminal-cores-emojis);
12. Artigo na Alura sobre como usar [VS Code para codar em Java](https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code);
13. Documentação do pacote [javax.imageio](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html), que trata de leitura e escrita de imagens;
14. Documentação da [classe BufferedImage](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html), que representa uma imagem no Java;
15. Documentação da classe [Graphics2D](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html), a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original;
16. Documentação da [abstração InputStream](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html), que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros;
17. Primeira aula do curso [“Java Polimorfismo: entenda herança e interfaces”](https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo) da Alura;
18. Apêndice da apostila [“Java e Orientação a Objetos”](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io) da Alura sobre o pacote java.io que explica com mais detalhes a abstração InputStream;
19. Documentação das [APIs da NASA](https://api.nasa.gov/);
20. API da [Foto Astronômica do dia da NASA](https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY);
21. Artigo na Alura “Como não aprender Java e Orientação a Objetos: getters e setters”;
22. Livro [“Design Patterns”](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612), de 1994, que descreve soluções comuns para problemas recorrentes de como organizar seu código;
23. Livro [“Refactoring”](https://www.amazon.com/Refactoring-Improving-Design-Existing-Code/dp/0201485672), de 1999, que cataloga maneiras sistemáticas de melhorar o código sem modificar o que é feito;
24. Artigo na Alura [“Como não aprender Java e Orientação a Objetos: herança”](https://www.alura.com.br/artigos/como-nao-aprender-orientacao-a-objetos-heranca);
25. Podcast Hipsters.tech sobre [Práticas de Orientação a Objetos](https://www.alura.com.br/podcast/praticas-de-orientacao-a-objetos-hipsters-129-a453);
26. Podcast Hipsters.tech sobre [Design Patterns](https://www.alura.com.br/podcast/design-patterns-hipsters-206-a345);
27. Podcast Hipsters.tech sobre [SOLID](https://www.alura.com.br/podcast/solid-codigo-bom-e-bonito-hipsters-ponto-tech-219-a649);
28. Livro Desbravando [SOLID](https://www.casadocodigo.com.br/products/livro-desbravando-solid) do instrutor Alexandre Aquiles;
29. Documentação do [Spring Framework](https://spring.io/);
30. Link para [iniciar](https://start.spring.io/) um projeto utilizando Spring;
31. Link para download do [Maven](https://maven.apache.org/download.cgi);
32. Link para download do [Postman](https://www.postman.com/);
33. Página para fazer o registro e começar a utilizar o [MongoDb Atlas](https://www.mongodb.com/cloud/atlas/register);
34. GitHub com os [logos](https://github.com/abrahamcalf/programming-languages-logos) das linguagens de programação;
35. Artigo sobre o [pack de stickers da Alura para Whatsapp e Telegram](https://www.alura.com.br/artigos/stickers-dev-aluraverso-whatsapp-telegram);
36. Primeira aula do curso [“Maven: gerenciamento de dependências e build de aplicações Java”](https://www.alura.com.br/conteudo/maven-gerenciamento-dependencias-build-aplicacoes-java) da Alura;
37. Alura + [“O que é REST?”](https://www.youtube.com/watch?v=weQ8ssA6iBU&ab_channel=AluraCursosOnline);
38. Artigo da Alura [“Conceito e fundamentos sobre REST”](https://www.alura.com.br/artigos/rest-conceito-e-fundamentos);
39. [Podcast Hipsters](https://www.hipsters.tech/mongodb-hipsters-ponto-tech-305/): Tech sobre MongoDB;
40. Hipters.Tube [“O que é SQL e NoSQL?”](https://www.youtube.com/watch?v=aure5d3B88g&ab_channel=AluraCursosOnline);
41. Artigo da Alura [“Spring: Conheça esse framework Java”](https://www.alura.com.br/artigos/spring-conheca-esse-framework-java);
42. Alura + [Introdução ao Postman](https://www.youtube.com/watch?v=op81bMbgZXs&ab_channel=AluraCursosOnline).










package imersaoAlura;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradorDeFigurinhas {

    public void criarFigurinhas(InputStream inputStream, String nomeArquivo, String texto) throws Exception {
    	// leitura da imagem
        // InputStream inputStream = 
        //             new FileInputStream(new File("entrada/filme-maior.jpg"));
        // InputStream inputStream = 
        //                 new URL("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@.jpg")
        //                 .openStream();
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // Criar nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // Copiar a imagem original pra novo imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);
        
//        BufferedImage imagemSobreposicao = ImageIO.read(inputStreamSobreposicao);
//        int posicaoImagemSobreposicaoY = novaAltura - imagemSobreposicao.getHeight();
//        graphics.drawImage(imagemSobreposicao, 0, posicaoImagemSobreposicaoY, null);

 
        // Configurar a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.GRAY);
        graphics.setFont(fonte);

        // Escrever texto centralizado em nova imagem
        FontMetrics fontMetrics = graphics.getFontMetrics();
        Rectangle2D rectancle = fontMetrics.getStringBounds(texto, graphics);
        int sizeText = (int) rectancle.getWidth();
        int posicaoTextX = (largura - sizeText)/2;
        int posicaoTextY = novaAltura - 100;
        graphics.drawString(texto, posicaoTextX, novaAltura - 100);

        FontRenderContext fontRenderContext = graphics.getFontRenderContext();
        var textLayout = new TextLayout(texto, fonte, fontRenderContext);
        
        //Contorno da figurinha
        Shape outline = textLayout.getOutline(null);
        AffineTransform transform = graphics.getTransform();
        transform.translate(posicaoTextX, posicaoTextY);
        graphics.setTransform(transform);
     
        var outlineStroke = new BasicStroke(largura * 0.004f);
        graphics.setStroke(outlineStroke);
        
        graphics.setColor(Color.DARK_GRAY);
        graphics.draw(outline);
        graphics.setClip(outline);
        
        // Escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));

    }
	
}

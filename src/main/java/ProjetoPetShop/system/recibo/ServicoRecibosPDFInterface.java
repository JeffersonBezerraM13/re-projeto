package ProjetoPetShop.system.recibo;

import java.io.IOException;

public interface ServicoRecibosPDFInterface {
    void gerarPDF(String conteudoRecibo, String nomeArquivo) throws IOException;
//    String gerarRecibo (int idServico);
//    default void gerarReciboPDF(int idServico) {
//    }

}

package ProjetoPetShop.system.recibo;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class ServicoRecibosPDFSystem implements ServicoRecibosPDFInterface {
    public static LocalDateTime dataDeHoje = LocalDateTime.now();


//    @Override
//    public void gerarReciboPDF(int idServico) {
//        if (!servicos.containsKey(idServico)) {
//            throw new ServicoNaoCadastradoException("Serviço com ID " + idServico + "não existe");
//        }
//        Servico servico = servicos.get(idServico);
//
//        if (servico.getAnimal().getTutor() == null){
//            throw new IllegalStateException("Serviço não vinculado a um animal");
//        }
//
//        try {
//            ServicoRecibosPDFSystem pdfRecibo = new ServicoRecibosPDFSystem();
//            String conteudo = servico.gerarRecibo();
//            String nomeArquivo = "recibo_" + idServico + "_" +
//                    servico.getDataHora().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
//
//            pdfRecibo.gerarPDF(conteudo, nomeArquivo);
//            System.out.println("Recibo gerado com sucesso: " + nomeArquivo + ".pdf");
//        } catch (IOException e) {
//            throw new RuntimeException("Falha ao gerar PDF do recibo: " + e.getMessage(), e);
//        }
//    }

    @Override
    public void gerarPDF(String conteudoRecibo, String nomeArquivo) throws IOException {

        Path outputDir = Paths.get("recibos");
        outputDir.toFile().mkdirs();

        try (PDDocument doc = new PDDocument()) {
            PDPage page = new PDPage();
            doc.addPage(page);

            try (PDPageContentStream content = new PDPageContentStream(doc, page)) {
                // Configuração básica
                content.setFont(PDType1Font.HELVETICA, 12);
                float y = 700; // Posição Y inicial

                // Processa cada linha corretamente
                String[] linhas = conteudoRecibo.split("\\r?\\n");

                for (String linha : linhas) {
                    // Remove caracteres não suportados
                    String linhaLimpa = linha.replaceAll("[^\\x00-\\x7F]", "");

                    if (!linhaLimpa.isEmpty()) {
                        content.beginText();
                        content.newLineAtOffset(50, y);
                        content.showText(linhaLimpa);
                        content.endText(); // Fecha cada bloco de texto
                        y -= 15; // Espaçamento entre linhas
                    }
                }
            }

            // Salva o documento
            doc.save("recibos/" + nomeArquivo + ".pdf");
        }
    }

//    @Override
//    public String gerarRecibo(int idServico) {
//        Servico servico = servicos.get(idServico);
//        if (servico == null) {
//            throw new ServicoNaoCadastradoException("Serviço não encontrado!");
//        }
//        return servico.gerarRecibo();
//    }

}
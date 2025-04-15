package ProjetoPetShop.entities;

public class Consulta extends Servico{
    private double valorVacina;
    private double valorMedicamento;
    private String descricao; //isso aqui não ta sendo usado em nenhum lugar importante


    public Consulta(int id, Animal animal, DataMarcadaServico dataMarcada,
                    Tamanho tamanho, String funcionario,
                    double valorBase, double percetualAcrescimoTamanho, String descricao) {

        super(id, animal,dataMarcada, tamanho, funcionario, valorBase, percetualAcrescimoTamanho);
        this.valorVacina = valorVacina;
        this.valorMedicamento = valorMedicamento;
        this.descricao = descricao;
    }

    @Override
    double calcularValorTotal() {
        return (super.valorBase+calcularAcrescimo()) + this.valorVacina + this.valorMedicamento;
    }

    @Override
    public String getDetalhesServico() {
//
//        StringBuilder sb = new StringBuilder();
//
//        try {
//            // Formatação segura usando String.format()
//            sb.append(String.format("║ %-33s ║%n", "CONSULTA VETERINÁRIA"));
//            sb.append(String.format("║ %-33s ║%n", " "));  // Linha em branco para espaçamento
//
//            // Adiciona informações básicas formatadas
//            sb.append(String.format("║ Tamanho: %-24s ║%n",
//                    (getTamanho() != null ? getTamanho().toString() : "Não informado")));
//
//            sb.append(String.format("║ Acréscimo (%%): %-19.2f ║%n",
//                    getPercentualAcrescimoTamanho()));
//
//            sb.append(String.format("║ Valor Acréscimo: R$ %-16.2f ║%n",
//                    calcularAcrescimo()));
//
//            if (valorVacina > 0) {
//                sb.append(String.format("║ Vacina: R$ %-23.2f ║%n", valorVacina));
//            }
//            if (valorMedicamento > 0) {
//                sb.append(String.format("║ Medicamentos: R$ %-16.2f ║%n", valorMedicamento));
//            }
//
//        } catch (Exception e) {
//            // Fallback seguro em caso de erro de formatação
//            System.err.println("Erro ao formatar detalhes da consulta: " + e.getMessage());
//            return "║ Erro ao gerar detalhes do serviço ║";
//        }
//        return sb.toString();
        return "TODO";
    }

    @Override
    public double calcularAcrescimo() {
        return super.valorBase*super.percentualAcrescimoTamanho;
    }

    public double getValorVacina() {
        return valorVacina;
    }

    public void setValorVacina(double valorVacina) {
        this.valorVacina = valorVacina;
    }

    public double getValorMedicamento() {
        return valorMedicamento;
    }

    public void setValorMedicamento(double valorMedicamento) {
        this.valorMedicamento = valorMedicamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return "TODO Concuslta";
    }
}

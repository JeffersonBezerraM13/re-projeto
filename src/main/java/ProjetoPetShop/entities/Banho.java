package ProjetoPetShop.entities;


public class Banho extends Servico {
    private String descricao;

    public Banho(int id, Animal animal, DataMarcadaServico dataMarcada,
                 Tamanho tamanho, String funcionario, double valorBase,
                 double percentualAcrescimoTamanho, String descricao) {
        super(id, animal, dataMarcada, tamanho, funcionario, valorBase, percentualAcrescimoTamanho);
        this.descricao = descricao;
    }

    @Override
    double calcularValorTotal() {
        return super.valorBase+calcularAcrescimo();
    }

    @Override
    public String getDetalhesServico() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("║ Tamanho: %-26s ║\n", getTamanho()));
        sb.append(String.format("║ Acréscimo (%%): %-19.2f ║\n", getPercentualAcrescimoTamanho()));
        sb.append(String.format("║ Valor Acréscimo: R$ %-16.2f ║\n", calcularAcrescimo()));
        sb.append(String.format("║ Descrição: %-24s ║\n", descricao));
        return sb.toString();
    }

    @Override
    public double calcularAcrescimo() {
        return super.valorBase*super.percentualAcrescimoTamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return "TODO Banho";
    }
}


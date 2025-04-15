package ProjetoPetShop.entities;

public class Tosa extends Servico{
    private boolean adicionarAcc;
    private double valoraAcc;
    private String descricao;

    public Tosa(int id, Animal animal, DataMarcadaServico dataMarcada,
                Tamanho tamanho, String funcionario, double valorBase,
                double percentualAcrescimoTamanho, boolean adicionarAcc,
                double valoraAcc, String descricao) {
        super(id, animal, dataMarcada, tamanho, funcionario, valorBase, percentualAcrescimoTamanho);
        this.adicionarAcc = adicionarAcc;
        this.valoraAcc = valoraAcc;
        this.descricao = descricao;
    }

    @Override
    public double calcularValorTotal() {
        //Calcular o valor base com o acrescimo, caso tenha o acc na tosa apenas soma o valor do acc
        double calc = super.valorBase+(super.valorBase*super.percentualAcrescimoTamanho);
        if (adicionarAcc) {
            calc += valoraAcc;
        }
        return calc;
    }

    @Override
    public String getDetalhesServico() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("║ Tamanho: %-26s ║\n", getTamanho()));
        sb.append(String.format("║ Acréscimo (%): %-19.2f ║\n", getPercentualAcrescimoTamanho()));
        sb.append(String.format("║ Valor Acréscimo: R$ %-16.2f ║\n", calcularAcrescimo()));

        if (adicionarAcc) {
            sb.append(String.format("║ Acessórios: R$ %-20.2f ║\n", valoraAcc));
        }
        sb.append(String.format("║ Descrição: %-24s ║\n", descricao));
        return sb.toString();
    }

    @Override
    double calcularAcrescimo() {
        return super.valorBase*super.percentualAcrescimoTamanho;
    }

    public boolean isAdicionarAcc() {
        return adicionarAcc;
    }

    public void setAdicionarAcc(boolean adicionarAcc) {
        this.adicionarAcc = adicionarAcc;
    }

    public double getValoraAcc() {
        return valoraAcc;
    }
    public void setValoraAcc(double valoraAcc) {
        this.valoraAcc = valoraAcc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return "TODO Tosa";
    }

}



package ProjetoPetShop.entities;

public class DataMarcadaServico{
    private int dia;
    private int mes;
    private int ano;

    public DataMarcadaServico(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override
    public String toString(){
        return (this.dia+"/"+this.mes+"/"+this.ano);
    }
}

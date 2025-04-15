package ProjetoPetShop.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 * Representa um animal de estimação no sistema do PetLover.
 * Cada animal está associado a um Tutor.
 */

public class Animal implements Serializable {
    private int codigo;
    private String nome;
    private String especie;
    private String raca;
    private Tamanho tamanho;
    private int idade;
    private String cpfDoTutor;
    //private List<Servico> servicosFeitos;

    public Animal(int codigo,String nome, String especie, String raca, Tamanho tamanho,int idade, String cpfDoTutor) {
        this.codigo = codigo;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.tamanho = tamanho;
        this.idade = idade;
        this.cpfDoTutor = cpfDoTutor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "TODO Animal";
    }
}
package ProjetoPetShop.entities;

import ProjetoPetShop.exception.AnimalJaExisteException;
import ProjetoPetShop.exception.AnimalNaoExisteException;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Representa o Tutor do animal de estimação no sistema do PetLover.
 * Cada Tutor está associado a um Animal.
 */


public class Tutor implements Serializable {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereço;
    private String email;
    List<Animal> animais;
    private int quantAnimal;

    public Tutor(String nome, String cpf, String telefone, String endereço, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereço = endereço;
        this.email = email;
    }

    public void cadastrarAnimal(String nome, String especie, String raca, Tamanho tamanho, int idade) throws AnimalJaExisteException{
        Animal animalCadastro = new Animal(this.animais.size(),nome,especie,raca,tamanho,idade,this.cpf);
        for(Animal a: this.animais){
            if(a.equals(animalCadastro)) throw new AnimalJaExisteException("O Animal de nome "+nome+" do tutor "+this.nome);
            else animais.add(animalCadastro);
        }
    }

    public Animal getAnimal(String nome) throws AnimalNaoExisteException{
        for(Animal a: this.animais)
            if(a.getNome().equalsIgnoreCase(nome))
                return a;
        throw new AnimalNaoExisteException("O pet "+this.nome+" do tutor "+this.nome+" cpf "+this.cpf+" não existe");
    }

    public void removerAnimal(String nome) throws AnimalNaoExisteException{
        for(Animal a: this.animais){
            if(a.getNome().equalsIgnoreCase(nome)){
                this.animais.remove(a);
            }
        }
        throw new AnimalNaoExisteException("O animal de nome "+nome+" do tutor "+this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public int getQuantidadeAnimaisDoTutor(){
        return this.animais.size();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tutor tutor = (Tutor) o;
        return Objects.equals(cpf, tutor.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "TODO Tutor";
    }
}

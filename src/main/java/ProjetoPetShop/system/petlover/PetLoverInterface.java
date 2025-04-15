package ProjetoPetShop.system.petlover;

import ProjetoPetShop.entities.Animal;
import ProjetoPetShop.entities.Tamanho;
import ProjetoPetShop.entities.Tutor;
import ProjetoPetShop.exception.*;

import java.io.IOException;
import java.util.Collection;

public interface PetLoverInterface {
    void cadastrarTutor(String nome, String cpf, String telefone, String endereco, String email) throws TutorJaExisteException;
    void cadastrarAnimal(String cpf, String nome, String especie, String raca, Tamanho tamanho, int idade) throws TutorNaoExisteException, AnimalJaExisteException;
    Collection<Animal> getAnimaisDeTutor(String cpfDoTutor) throws TutorNaoExisteException, NaoHaAnimaisCadastradosException;
    Collection<Tutor> getTodosOsTutores() throws NaoHaTutoresCadastradosException;
    Animal getAnimalDoTutor(String cpfDoTutor, String nomeAnimal) throws TutorNaoExisteException, AnimalNaoExisteException;
    Tutor getTutor(String cpf) throws TutorNaoExisteException;
    //void atualizarAnimal(String cpf, String nome, Animal animal) throws TutorNaoExisteException, AnimalNaoExisteException;
    //Fazer um metodo nas entidades para poder atualizar diretamente os dados de forma InformationExpert
    //void atualizarTutor(String cpf, Tutor tudor) throws TutorNaoExisteException;
    void removerTutor(String cpf) throws TutorNaoExisteException;
    void removerAnimal(String cpf, String nome) throws TutorNaoExisteException, AnimalNaoExisteException;
    void gravarTutoresERespectivosAnimais() throws IOException;
    void recuperarTutoresERecpectivosAnimais() throws IOException;

//    void cadastrarAnimal (Animal animal);
//    Animal buscarAnimalPorID (int id);
//    List<Animal> listarAnimaisPorTutor (String cpf);
//    void removerAnimal (int id);
//    List<Animal> listarTodosAnimais ();
//    void atualizarAnimal (Animal animal);
//
//    /* Métodos de Tutores */
//    void cadastrarTutor(Tutor tutor);
//    Tutor buscarTutorPorCpf(String cpf);
//    List<Tutor> listarTodosTutores();

    /** Prováveis Futuros Métodos Para Serviços

    void agendarConsulta(Consulta consulta);
    void agendarBanho(Banho banho);
    void agendarTosa(Tosa tosa);
    Servico buscarServico(int id);
    void atualizarServico(Servico servico);
    void cancelarServico(int id);
    List<Servico> listarServicosPorAnimal(int idAnimal);
    List<Servico> listarServicosPorTutor(String cpfTutor);

     */

}

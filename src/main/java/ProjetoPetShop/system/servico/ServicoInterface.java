package ProjetoPetShop.system.servico;

import ProjetoPetShop.entities.Servico;
import ProjetoPetShop.exception.*;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface ServicoInterface {
    void cadastrarServico(Servico servico) throws ServicoJaExisteException;
    Collection<Servico> getServicos() throws NaoHaServicosCadastradoException;
    Servico getServico(int id) throws ServicoNaoExisteException;
    //void atualizarServico(int id)
    Collection<Servico> listarServicosDoDia() throws NaoHaServicosDoDiaException;
    Collection<Servico> listarServicosPendentes() throws NaoHaServicosPendentesException;
    void removerServico(int id) throws ServicoNaoExisteException;
    void gravarServicos() throws IOException;
    void recuperarServicos() throws IOException;
}

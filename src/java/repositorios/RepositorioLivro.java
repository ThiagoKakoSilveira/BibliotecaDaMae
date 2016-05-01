package repositorios;

import java.util.ArrayList;
import java.util.List;
import modelos.Livro;
import util.Mensageiro;

/**
 *
 * @author Thiago
 */
public class RepositorioLivro {

    List<Livro> repositorio;

    public RepositorioLivro() {
        repositorio = new ArrayList<>();
    }

    public List<Livro> getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(List<Livro> repositorio) {
        this.repositorio = repositorio;
    }

    public void addLivro(Livro livro) {
        if (livro.getId() == null) {
            livro.setId(repositorio.size()+1);
            notificaECadastra(livro);
        } else {
            atualizaLivro(livro);
            Mensageiro.notificaInformacao("Parabéns", "Livro editado com sucesso!");
        }
    }

    private void notificaECadastra(Livro livro) {
        repositorio.add(livro);
        Mensageiro.notificaInformacao("Parabéns", "Livro cadastrado com sucesso!");
    }

    public void atualizaLivro(Livro livro) {
        for (Livro l : repositorio) {
            if (l == livro) {
                l = new Livro(livro);
            }
        }
    }

    public void remover(Livro livro) {
        for (Livro l : repositorio) {
            if (l == livro) {
                repositorio.remove(l);
            }
        }
    }
}

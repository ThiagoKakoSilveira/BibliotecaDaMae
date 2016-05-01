package repositorios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelos.Emprestimo;
import util.Mensageiro;

/**
 *
 * @author Thiago
 */
public class RepositorioEmprestimo {

    List<Emprestimo> repositorio;

    public RepositorioEmprestimo() {
        repositorio = new ArrayList<>();
    }

    public List<Emprestimo> getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(List<Emprestimo> repositorio) {
        this.repositorio = repositorio;
    }

    public void addEmprestimo(Emprestimo emprestimo) {
        if (emprestimo.getId() == null) {
            emprestimo.setId(repositorio.size() + 1);
            emprestimo.setEmprestimoAtivo(true);
            notificaECadastra(emprestimo);
        } else {
            atualiza(emprestimo);
            Mensageiro.notificaInformacao("Parabéns", "Empréstimo editado com sucesso!");
        }
    }

    private void notificaECadastra(Emprestimo emprestimo) {
        repositorio.add(emprestimo);
        Mensageiro.notificaInformacao("Parabéns", "Empréstimo cadastrado com sucesso!");
    }

    public void atualiza(Emprestimo emprestimo) {
        for (Emprestimo e : repositorio) {
            if (e == emprestimo) {
                e = emprestimo;
            } else {
                Mensageiro.nootificaErro("Erro na atualização", "Não existe esse empréstimo");
            }
        }
    }

    public void remover(Emprestimo emprestimo) {
        for (Emprestimo e : repositorio) {
            if (e == emprestimo) {
                repositorio.remove(e);
            } else {
                Mensageiro.nootificaErro("Erro na exclusão", "Não existe esse empréstimo");
            }
        }
    }

    public void devolver(Emprestimo emprestimo) {
        if (emprestimo.isEmprestimoAtivo()) {
            emprestimo.setDataDevolucao(new Date());
            emprestimo.setEmprestimoAtivo(false);
            for (Emprestimo e : repositorio) {
                if (e == emprestimo) {
                    e = emprestimo;
                    Mensageiro.notificaInformacao("Parabéns", "Empréstimo devolvido com sucesso!");
                } else {
                    Mensageiro.nootificaErro("Erro na devolução", "Não existe esse emprétimo");
                }
            }
        }
    }
}

package modelos;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Thiago
 */
public class Emprestimo {

    private Integer id;
    private Livro livro;
    private Pessoa amigo;
    private Date dataEmprestimo, dataDevolucao;
    private boolean emprestimoAtivo;

    public Emprestimo() {
    }

    public Emprestimo(Integer id, Livro livro, Pessoa amigo, Date dataEmprestimo, Date dataDevolucao, boolean emprestimoAtivo) {
        this.id = id;
        this.livro = livro;
        this.amigo = amigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.emprestimoAtivo = emprestimoAtivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getAmigo() {
        return amigo;
    }

    public void setAmigo(Pessoa amigo) {
        this.amigo = amigo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isEmprestimoAtivo() {
        return emprestimoAtivo;
    }

    public void setEmprestimoAtivo(boolean emprestimoAtivo) {
        this.emprestimoAtivo = emprestimoAtivo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.livro);
        hash = 89 * hash + Objects.hashCode(this.amigo);
        hash = 89 * hash + Objects.hashCode(this.dataEmprestimo);
        hash = 89 * hash + Objects.hashCode(this.dataDevolucao);
        hash = 89 * hash + (this.emprestimoAtivo ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emprestimo other = (Emprestimo) obj;
        if (this.emprestimoAtivo != other.emprestimoAtivo) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.livro, other.livro)) {
            return false;
        }
        if (!Objects.equals(this.amigo, other.amigo)) {
            return false;
        }
        if (!Objects.equals(this.dataEmprestimo, other.dataEmprestimo)) {
            return false;
        }
        if (!Objects.equals(this.dataDevolucao, other.dataDevolucao)) {
            return false;
        }
        return true;
    }
}

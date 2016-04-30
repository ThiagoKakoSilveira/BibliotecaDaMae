package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelos.Livro;
import repositorios.RepositorioLivro;

/**
 *
 * @author Thiago
 */
@ManagedBean
@SessionScoped
public class LivroMb {

    private Livro livro;
    private RepositorioLivro repositorio;

    public LivroMb() {
        repositorio = new RepositorioLivro();
        livro = new Livro();
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public RepositorioLivro getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(RepositorioLivro repositorio) {
        this.repositorio = repositorio;
    }
    
    public void salvar(){
        repositorio.addLivro(getLivro());
        limpar();
    }

    public void limpar() {
        setLivro(new Livro());
    }
    
    public void deletarLivro(){
        repositorio.remover(getLivro());
    }

}

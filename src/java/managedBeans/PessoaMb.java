package managedBeans;

import modelos.Pessoa;
import repositorios.RepositorioPessoa;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Thiago
 */

@ManagedBean
@SessionScoped
public class PessoaMb {
    private Pessoa amigo;
    private RepositorioPessoa repositorio;

    public PessoaMb() {
        repositorio = new RepositorioPessoa();
        amigo = new Pessoa();
    }

    public Pessoa getAmigo() {
        return amigo;
    }

    public void setAmigo(Pessoa amigo) {
        this.amigo = amigo;
    }

    public RepositorioPessoa getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(RepositorioPessoa repositorio) {
        this.repositorio = repositorio;
    }
    
    
    
    
    
}

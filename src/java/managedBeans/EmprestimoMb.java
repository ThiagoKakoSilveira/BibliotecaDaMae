package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelos.Emprestimo;
import repositorios.RepositorioEmprestimo;

/**
 *
 * @author Thiago
 */
@ManagedBean
@ViewScoped
public class EmprestimoMb {
    private Emprestimo emprestimo;
    private RepositorioEmprestimo listaDeEmprestimo;

    public EmprestimoMb() {
        emprestimo = new Emprestimo();
        listaDeEmprestimo = new RepositorioEmprestimo();
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public RepositorioEmprestimo getListaDeEmprestimo() {
        return listaDeEmprestimo;
    }

    public void setListaDeEmprestimo(RepositorioEmprestimo listaDeEmprestimo) {
        this.listaDeEmprestimo = listaDeEmprestimo;
    }
    
    public void salvar(){
        
    }
    
    public void deletar(){
        
    }
    
    public void limpar(){
        setEmprestimo(new Emprestimo());
        
    }
}

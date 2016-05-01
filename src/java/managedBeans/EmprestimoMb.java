package managedBeans;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelos.Emprestimo;
import repositorios.RepositorioEmprestimo;

/**
 *
 * @author Thiago
 */
@ManagedBean
@SessionScoped
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
        listaDeEmprestimo.addEmprestimo(getEmprestimo());
        limpar();
    }
    
    public void deletar(){
        listaDeEmprestimo.remover(getEmprestimo());
    }
    
    public void limpar(){
        setEmprestimo(new Emprestimo());        
    }
    
    public void devolver(Emprestimo emprestimo){
        listaDeEmprestimo.devolver(emprestimo);
        limpar();
    }
}

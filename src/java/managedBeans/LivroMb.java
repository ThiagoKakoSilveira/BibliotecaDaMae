/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private RepositorioLivro livros;

    public LivroMb() {
    }
    
    
    
}

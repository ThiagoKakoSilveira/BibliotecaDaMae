package repositorios;

import java.util.ArrayList;
import java.util.List;
import modelos.Livro;

/**
 *
 * @author Thiago
 */
public class RepositorioLivro {
    List<Livro> livros;

    public RepositorioLivro() {
        livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
}

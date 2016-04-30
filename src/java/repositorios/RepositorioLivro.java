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
    
    public void addLivro(Livro livro){
        if(livro.getId() == null){
            if(livros.isEmpty()){
                livro.setId(1);
                livros.add(livro);
                Mensageiro.notificaInformacao("Parabéns", "Livro cadastrado com sucesso!");                
            }
        }else{
            atualizaLivro(livro);
            Mensageiro.notificaInformacao("Parabéns", "Livro editado com sucesso!");
        }
    }

    public void atualizaLivro(Livro livro) {
        for (Livro l : livros) {
            if(l==livro){
                l = new Livro(livro);
            }
        }
    }
    
    public void remover(Livro livro){
        for (Livro l : livros) {
            if(l == livro){
                livros.remove(l);
            }
        }        
    }
}

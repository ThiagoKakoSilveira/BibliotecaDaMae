package repositorios;

import java.util.ArrayList;
import java.util.List;
import modelos.Pessoa;

/**
 *
 * @author Thiago
 */
public class RepositorioPessoa {
    List<Pessoa> pessoas;
    
    public RepositorioPessoa(){
        pessoas = new ArrayList<>();
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public boolean addPessoa(Pessoa pessoa){
        return (pessoas.add(pessoa));
    }
    
    public boolean pessoaExiste(String login){
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getLogin().equals(login)){
                return true;
            }            
        }
        return false;
    }
    
    public Pessoa devolvePessoa(String login){
         for (Pessoa pessoa : pessoas) {
             if(pessoa.getLogin().equals(login)){
                 return pessoa;
             }
         }
         return null;
     }
    
    public Pessoa devolvePessoaPorEmail(String email){
         for (Pessoa pessoa : pessoas) {
             if(pessoa.getEmail().equals(email)){
                 return pessoa;
             }             
         }
         return null;
     }
    
    public void remover(Pessoa p){
        for (Pessoa pessoa : pessoas){
            if(pessoa == p){
                pessoas.remove(p);
            }
        }
    }
}

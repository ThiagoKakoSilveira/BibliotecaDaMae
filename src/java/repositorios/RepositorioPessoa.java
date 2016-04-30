package repositorios;

import java.util.ArrayList;
import java.util.List;
import modelos.Pessoa;
import util.Mensageiro;

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
    
    public void addPessoa(Pessoa pessoa){
        if(pessoa.getId()== null){
//            if()
            pessoa.setId(pessoas.size()+1);
            pessoas.add(pessoa); 
            Mensageiro.notificaInformacao("Parabéns", "Cliente cadastrado com sucesso!");
        }
        else{
            atualiza(pessoa);
            Mensageiro.notificaInformacao("Parabéns", "Cliente editado com sucesso!");
        }
    }
    
    public boolean pessoaExiste(Pessoa pessoa){
        for (Pessoa p : pessoas) {
            if(p == pessoa){
                return true;
            }
        }
        return false;
    }
    
    public Pessoa devolvePessoaPorLogin(String login){
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
    
    public void atualiza(Pessoa p){
        for (Pessoa pessoa : pessoas) {
            if(pessoa == p){
                pessoa = new Pessoa(p);
            }
        }
    }
}

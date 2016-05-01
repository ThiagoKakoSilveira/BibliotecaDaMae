package modelos;

import java.util.Date;
import java.util.Objects;
import util.DateUtil;

/**
 *
 * @author Thiago
 */
public class Livro {
    private String titulo,autor, sinopse;
    private boolean emprestado;
    private Date aquisicao;
    private Integer id;
    
    public Livro(){
        
    }
    
    public Livro(String titulo, String autor, boolean emprestimo, String sinopse, Date aquisicao){
        this.autor = autor;
        this.emprestado = emprestimo;
        this.titulo = titulo;  
        this.sinopse = sinopse;
    }

    public Livro(Livro livro) {
        this.autor = livro.getAutor();
        this.emprestado = livro.isEmprestado();
        this.titulo = livro.getTitulo();  
        this.sinopse = livro.getSinopse();        
        this.id = livro.getId();
        this.aquisicao = livro.aquisicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
    
    public String getEmprestadoString(){
        if(emprestado)return "Emprestado";
        else return "Em casa";
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public Date getAquisicao() {
        return aquisicao;
    }
    
    public String getAquisicaoString(){
        return DateUtil.dateToString(getAquisicao());
    }

    public void setAquisicao(Date dataDeAquisição) {
        this.aquisicao = dataDeAquisição;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.titulo);
        hash = 13 * hash + Objects.hashCode(this.autor);
        hash = 13 * hash + Objects.hashCode(this.sinopse);
        hash = 13 * hash + (this.emprestado ? 1 : 0);
        hash = 13 * hash + Objects.hashCode(this.aquisicao);
        hash = 13 * hash + this.id;
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
        final Livro other = (Livro) obj;
        if (this.emprestado != other.emprestado) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.sinopse, other.sinopse)) {
            return false;
        }
        if (!Objects.equals(this.aquisicao, other.aquisicao)) {
            return false;
        }
        return true;
    }
}

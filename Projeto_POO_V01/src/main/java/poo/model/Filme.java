package poo.model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Filme extends Streaming {

    private String Diretor;
    private LocalDate Lancamento; // quando foi lançado?

    public Filme(Integer Duracao, String Titulo, String Classificacao, String Categoria, String Diretor, LocalDate Lancamento){

        super(Duracao, Titulo, Classificacao, Categoria);

        this.Diretor = Diretor;
        this.Lancamento = Lancamento;
    };


    // Getters e Setters
    public String getDiretor() {
        return this.Diretor;
    }

    public void setDiretor(String Diretor) {
        this.Diretor = Diretor;
    }

    public LocalDate getLancamento() {
        return this.Lancamento;
    }

    public void setLancamento(LocalDate Lancamento) {
        this.Lancamento = Lancamento;
    }

}

package poo.model;

import javax.persistence.Entity;


@Entity
public class Serie extends Streaming {
    private Integer Temporada; // colocar int em vez de string para poder calular algo futuraente?
    private Integer Episodio;


    public Serie(Integer Duracao, String Titulo, String Classificacao, String Categoria, Integer Temporada, Integer Episodio){

        super(Duracao, Titulo, Classificacao, Categoria);// Chamando o construtor da superclasse

        this.Temporada = Temporada;
        this.Episodio = Episodio;
    };

    //Getter e Setters

    public Integer getTemporada() {
        return this.Temporada;
    }

    public void setTemporada(Integer Temporada) {
        this.Temporada = Temporada;
    }

    public Integer getEpisodio() {
        return this.Episodio;
    }

    public void setEpisodio(Integer episodio) {
        this.Episodio = episodio;
    }

    
}

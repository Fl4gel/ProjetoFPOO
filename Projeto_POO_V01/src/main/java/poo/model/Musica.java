package poo.model;

import javax.persistence.Entity;

@Entity
public class Musica extends Streaming {

    private String Artista;

    public Musica(Integer Duracao, String Titulo, String Classificacao, String Categoria, String Artista){

        super(Duracao, Titulo, Classificacao, Categoria);// Chamando o construtor da superclasse

        this.Artista = Artista;
    };


    public String getArtista() {
        return this.Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    
}

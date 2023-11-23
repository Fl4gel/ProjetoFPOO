package poo.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("FILME")
public class Musica extends Streaming {

    @Id
    @Column(name = "id")
    private Long id;

    // @GeneratedValue(strategy = GenerationType.AUTO)
    // private Long id;

    private String Artista;

    public Musica(){

    };

    public Musica(Integer Duracao, String Titulo, String Classificacao, String Categoria, String Artista) {
        
        super(Duracao, Titulo, Classificacao, Categoria);
        
        setArtista(Artista);
    }

    // Getters e Setters
    public String getArtista() {
        return this.Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }


    public void setId(Long id) {
        this.id = id;
    }


    //To string
    @Override
    public String toString() {
        return "Musica: \n" +
                "\nTitulo = " + getTitulo() +
                "\nCategoria = " + getCategoria() +
                "\nClassificacao = " + getClassificacao() +
                "\nDuracao = " + getDuracao() + " minutos" +
                "\nLancamento = " + getArtista();
    }

}

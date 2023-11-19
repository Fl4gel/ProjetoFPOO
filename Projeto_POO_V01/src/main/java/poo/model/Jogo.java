package poo.model;


import javax.persistence.Entity;


@Entity
public class Jogo extends Streaming {

    private String Studio;


    public Jogo(Integer Duracao, String Titulo, String Classificacao, String Categoria, String Studio){

        super(Duracao, Titulo, Classificacao, Categoria);// Chamando o construtor da superclasse

        this.Studio = Studio;
    };
    //Getters e setters
    public String getStudio(){
        return this.Studio;
    }

    public void setStudio (String Studio){
        this.Studio = Studio;
    }

    
}

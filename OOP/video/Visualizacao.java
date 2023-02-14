package video;

import java.util.Scanner;

public class Visualizacao  {

    Scanner scanner = new Scanner(System.in);
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme){
        setEspectador(espectador);
        setFilme(filme);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
        this.filme.play();
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if(porc<=20){
            tot=3;
        }
        else if(porc<=50){
            tot = 5;
        }
        else if(porc<=90){
            tot = 8;
        }
        else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
}   

package luta;

import java.util.Random;

public class desafio {
    private lutador desafiante;
    private lutador desafiado;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(lutador l1, lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            System.out.println(getAprovada());
            this.desafiante = l1;
            this.desafiado = l2;
        }
        else{
            this.aprovada = false;
            System.out.println(getAprovada());
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            this.desafiante.apresentar();
            this.desafiado.apresentar();
            Random rd = new Random();
            int vencedor = rd.nextInt(3);
            switch(vencedor){
                case(0):
                System.out.println("Empatou");
                desafiante.empatar();
                desafiado.empatar();
                break;      
                case(1):
                System.out.println("Desafiante ganhou");
                desafiante.ganharLuta();
                desafiado.perderLuta();
                break;
                case(2):
                System.out.println("Desafiado ganhou");
                desafiante.perderLuta();
                desafiado.ganharLuta();    
                break;
            }
        }
        else
            System.out.println("Esta luta n pode acontecer"); 
    }
    public lutador getDesafiado() {
        return desafiado;
    }
    public lutador getDesafiante() {
        return desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public boolean getAprovada(){
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public void setDesafiado(lutador desafiado) {
        this.desafiado = desafiado;
    }
    public void setDesafiante(lutador desafiante) {
        this.desafiante = desafiante;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

}




package Fps;

public class P1 extends Jogador{

    Automatica metranca;

    public P1(){
        arma = new SemiAuto();
    }
    
    public void Weaponfire(){
        metranca.atirar();
    }
    
}

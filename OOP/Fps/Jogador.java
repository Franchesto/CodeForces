package Fps;

public abstract class Jogador {
    private String nick;
    Arma arma;
      
    public String getNick(){
        return nick;
    }
    public void setNick(String nick){
        this.nick = nick;
    }
    public void Weaponfire(){
        arma.atirar();
    }
    public void setWeapon(Arma tipo){
        this.arma = tipo;
    }
}

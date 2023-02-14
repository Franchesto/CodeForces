package Fps;

import java.util.Scanner;

public class Jogar {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Jogador p2 = new P2();
        String x = scanner.next();
        p2.setNick(x);
        p2.Weaponfire();
        p2.setWeapon(new Automatica());
        p2.Weaponfire();
    }
}

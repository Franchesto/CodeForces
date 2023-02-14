package caixa;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Banco c1 = new Banco();
        c1.depositar();
        c1.getSaldo();
        c1.sacar();
        c1.fecharConta();
    
        Banco c2 = new Banco();
        c1.depositar();
        c1.getSaldo();
        c1.sacar();
        c1.fecharConta();
  
    }
}

package caixa;

import java.util.Scanner;

public class Banco {

    Scanner scanner = new Scanner(System.in);
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;
    private String fconta;
    private int Sacar;
    private int depositar;

    public Banco(){
        System.out.println("Para abrir sua conta digite seu nome e depois o numero da conta");
        dono = scanner.next();
        numConta = scanner.nextInt();
        this.status = true;
        this.saldo = 0;
    }
    public int getnumConta(){
        return numConta;
    }
    public void setnumConta(int nc){
        this.numConta = nc;
    }
    public String gettipo(){
        return tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(Boolean s){
        this.status = s;
    }
    public void depositar(){
        System.out.println("Quanto gostarias de depositar?");
        this.depositar = scanner.nextInt();      
        setSaldo(getSaldo() + this.depositar);
    }
    public void sacar(){
        System.out.println("Quanto gostarias de sacar?");
        this.Sacar = scanner.nextInt();
        if(this.Sacar>this.saldo){
            System.out.println("Voce nao pode sacar este valor, seu saldo eh de apenas "+ saldo);
        }
        else{
            this.saldo = this.saldo - this.Sacar;
            System.out.println("Voce sacou "+ this.Sacar);
            System.out.println("Seu novo saldo eh "+ this.saldo);
        }
    }
    public void fecharConta(){
        System.out.println("Voce gostaria de fechar sua conta? Digite S ou N");
        this.fconta = scanner.next();
        if(this.fconta.equals("S")){
            if(this.saldo == 0){
                System.out.println("Sua conta foi fechada");
                this.numConta = 0;
                this.status = false;
            }
            else{
                if(this.saldo>0){
                    this.Sacar = this.saldo;
                    while(this.saldo>0){
                        System.out.println("seu saldo eh " + this.saldo + " Saque todo ele para fechar sua conta");
                        sacar();
                    }
                    System.out.println("Sua conta foi fechada");
                }
                else{
                    System.out.printf("Voce esta devendo %d ao banco, pague suas dividas, limpe seu nome e feche sua conta", this.saldo);
                }
            }
        }
        else{
            System.out.println("Que bom que continuaras conosco");

        }
        }
    
}

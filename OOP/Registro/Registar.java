package Registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Registar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);    
        ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
        ArrayList<Dado> dados = new ArrayList<Dado>();
        while(true){
            String nome = scanner.next();
            String data = scanner.next();
            String cpf = scanner.next();
            float peso = scanner.nextFloat();
            float altura = scanner.nextFloat();
            
            pessoa.add(new Pessoa(peso, altura, cpf));
            dados.add(new Dado(nome, data, cpf));
            for (Pessoa k : pessoa) {
                k.Imc();
                k.info();
                for (Dado j : dados) {
                    if (j.getCpf().equals(k.getCpf()))
                        System.out.printf("Nome: %s, peso %f.\n", j.getNome(), k.getPeso());
                }
            }
            System.out.println("Sigite `true` para continuar");
            boolean continuar = scanner.nextBoolean();          
            if(continuar==false){
                break;
            }

        }
    }
}

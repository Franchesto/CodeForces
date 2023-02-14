package Livros;

import java.util.Scanner;

public class teste1 {   
    public static void main(String[] args){
        Livros livro1 = new Livros();
        livro1.nome = "Sapiens";
        livro1.paginas = 550;
        livro1.cor = "Branco";
        livro1.aberto = true;

        livro1.tamanho();
        livro1.tipo();
        livro1.legivel();

        Livros livro2 = new Livros();
        livro2.nome = "Harry Potter";
        livro2.paginas = 600;
        livro2.cor = "Vermelho";
        livro2.aberto = false;
        
        livro2.tamanho();
        livro2.tipo();
        livro2.legivel();

        Scanner scanner = new Scanner(System.in);
        Livros livro3 = new Livros();
            
            System.out.println("Que livro estas a ler agora?");
            livro3.nome = scanner.next();
            System.out.println("Quantas páginas ele têm?");
            livro3.paginas = scanner.nextInt();
            System.out.println("Capa dura ou mole?");
            livro3.capa = scanner.next();
            System.out.println("Ele esta aberto ou fechado?");
            livro3.aberto = scanner.nextBoolean();

        livro3.tamanho();
        livro3.tipo();
        livro3.legivel();


    
    }
}

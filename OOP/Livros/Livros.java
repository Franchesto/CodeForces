package Livros;

import java.util.Scanner;

public class Livros {
    public String nome;
    String capa;
    String cor;
    String genero;
    int paginas;
    boolean aberto;
 

    void tamanho(){
        if(paginas >= 300){
            System.out.printf("Este livro eh grande, ele tem %s paginas\n ", this.paginas);
        }else {
            System.out.printf("Um livretinho curto, ele tem %s paginas\n", this.paginas);
        }
    }
    void tipo(){
        if(capa=="dura"){
            System.out.printf("%s eh um livro de capa dura\n", this.nome);
        }else{
            System.out.printf("%s eh um livro de capa mole\n", this.nome);
        }
        }
    void legivel(){
        if(aberto == true){
            System.out.println("Apenas leia o livro");
        }else {
            System.out.println("Abra o livro e leia");
        }
    
    }

}

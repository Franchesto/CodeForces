package poo2;

import java.util.Scanner;

public class Livros {
    private String nome;
    private String lingua;
    private String editora;
    private int paginas;
    private boolean aberto;
    Scanner scanner = new Scanner(System.in);
    
    public Livros(String nome, int paginas){
        nome = scanner.next();
        this.nome = nome;
        paginas = scanner.nextInt();
        this.paginas = paginas;
        aberto = false;
    }
    public String getNome(){
        return this.nome;
    }
    public int getPaginas(){
        return this.paginas;
    }
    public String getLingua(){  
        return this.lingua;
    }
    public void setLingua(String l){
        this.lingua = l;
    }
    public String getEditora(){
        return this.editora;
    }
    public void setEditora(String e){
        this.editora = e;
    }
    public void Scanner(){
        System.out.println("Qual nome do livro?");
        String nome = scanner.next();
        System.out.println("Quantas paginas ele tem?");
        
    }
    
    public void status(){
        System.out.println(this.getNome() + " "+ this.getLingua() + " " + this.getEditora() + " ");
        System.out.println(this.getPaginas() + " paginas");
        System.out.println(this.aberto + ". Este livro esta fechado");    
    }

}

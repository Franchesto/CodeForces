package Mercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Item extends Produto{
    public Item(String nome, String setor, int estoque, int preco) {
        super(nome, setor, estoque, preco);
        //TODO Auto-generated constructor stub
    }
    Scanner scanner = new Scanner(System.in);

    public void escolherProduto(){
        ArrayList<Produto> produtoList = new ArrayList<Produto>();
        produtoList.add(new Produto("Banana", "Hortifruti", 10, 5));
        produtoList.add(new Produto("Manga", "Hortifruti", 10, 5));

        System.out.println("Monte uma lista com 4 produtos");
        for(int i=0;i<4;i++){
            String it = scanner.next();
            for (Produto prd : produtoList) {
                if (prd.getItem().equals(it))
                    System.out.println("Encontramos o seu produto");
            }
        }
    }
    public void name() {
        Produto prd = new Produto("Banana", "Hortifruti", 10, 5);
        prd.getEstoque();
        this.getEstoque();
    }
}
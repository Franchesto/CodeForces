package Mercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Comprar {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String h = scanner.next();
        
        ArrayList<Produto> produtoList = new ArrayList<Produto>();
        produtoList.add(new Produto("Banana", "Hortifruti", 10, 5));
        produtoList.add(new Produto("Manga", "Hortifruti", 10, 5));
   
        System.out.println("Monte uma lista com 4 produtos");
        for(int i=0;i<4;i++){
            String it = scanner.next();
            for (Produto prd : produtoList) {
                if (prd.getSetor().equals(it))
                    System.out.println(prd.getItem());
                    
            }
        }
    }
}

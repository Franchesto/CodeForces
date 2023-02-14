import java.util.Scanner;

public class bit {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int u = 0;
        for (int i=0; i<x; i++){
            String z = scanner.next();
            if(z.equals("X++") || z.equals("++X")){
                u++;
            }
            else{
                u--;
            }
            }
            System.out.println(u);      
        }
        }   

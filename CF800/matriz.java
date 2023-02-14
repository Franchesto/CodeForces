import java.util.Scanner;

public class matriz {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        int c = 0;
        int v = 0;
        int[][] x = new int[5][5];    
                for(int i=0;i < x.length; i++){
                    for(int j=0; j<x.length; j++){
                        int a = scanner.nextInt();
                        x[i][j] = a;
                            if(x[i][j] == 1){
                                c = i;
                                v = j;
                                }
                            }
                        }
            if(c <= 1 && v >= 3 || c >=3 && v <=1){
                int y = 2 - c;
                int b = 2 - v;
                int u = y - b;
                if(u<0){
                    System.out.println(u*-1);    
                }
                else{
                    System.out.println(u);
                }
            }
            else{
            int y = 2 - c;
            int b = 2 - v;
            int u = y + b;
            if(u<0){
                System.out.println(u*-1);    
            }
            else{
                System.out.println(u);
            }}
            
        
        }
    }

          

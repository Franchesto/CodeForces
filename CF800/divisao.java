import java.util.Scanner;

public class divisao {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int [][] matriz = new int[12][12]; 
        int soma;
        int p = 0;
        for(int i = 0; i<=11; i++){
            System.out.println("entreia");    
                for(int j=0; j<=11; j++){
                    int y = scanner.nextInt();
                    matriz [i][j] = y;         
                    if(i==j){ 
                        for(int k=0; k<11; k=+2){
                            soma = matriz[k][k] + matriz[k+1][k+1];
                            p =+ soma;
                            }
                        if(s=="S") {
                            System.out.println(p);
                            }
                        else{
                            System.out.println(p/12);
                        }
                            }
                        }
                    }    
                }
            }

   

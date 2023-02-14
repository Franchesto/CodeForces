import java.util.Scanner;

public class Snake {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean a = true;
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0){
                    System.out.print("#");
                    if(j==m-1)
                        System.out.println("");
                }
                else if(a){
                    if(j<m-1)
                        System.out.print(".");
                    else if(j==m-1){
                        System.out.print("#\n");
                        a = false;
                    }
                    }
                else{
                    if(j==0){
                        System.out.print("#");
                    }
                    else if(j<m-1){
                        System.out.print(".");
                    }
                    else{
                        System.out.print(".\n");
                        a = true;
                    }
                }
                }
        }
    }
    }
    


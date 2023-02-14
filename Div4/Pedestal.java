import java.util.Scanner;

public class Pedestal {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x1 = 0;
        int x2=0;
        int x3=0;
        for(int i=0; i<n;i++){
            int b = scanner.nextInt();   
                if(b%3==0){
                    x1 = b/3 + 3;
                    x2 = b/3 - 1;
                    x3 = b/3 - 2;
                }
                    
            System.out.printf("%d %d %d\n", x2, x1, x3);
        }        
    }
    
}

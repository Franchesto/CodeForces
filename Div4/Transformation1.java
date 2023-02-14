import java.util.Scanner;

public class Transformation1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int a, b = 0, c = 0;
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            a = y/x;
            System.out.printf(y%x!=0 ? "0 0\n" : "1 %d\n", a);
            }
        
        }
    }
    

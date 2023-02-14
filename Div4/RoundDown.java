import java.util.Scanner;

public class RoundDown {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int a = scanner.nextInt();
            int b = (int) Math.log10(a);
            int c = (int) Math.pow(10, b);
            System.out.println(a-c);
        }
    }
    
}

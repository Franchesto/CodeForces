import java.util.Scanner;

public class Coins {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int c = 0;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            c = a + (b*2);
            if(a==0){
                System.out.println(1);
            }
            else if(b==0)
                System.out.println(a + 1);
            else
                System.out.println(c+1);
        }
    }
}
            

import java.math.BigInteger;
import java.util.Scanner;

public class AvtoBus {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while(i-->0){
            long a, b = 1;
            long n = scanner.nextInt();
            BigInteger n1 = new BigInteger(scanner.next());
            if(n%2==0){
                if(n%4==0)
                    a = n/4;
                else
                    a = (n-6)/4;
                if(n%6==0)
                    b = n/6;
                else
                    if((n-4)/6%6==0)
                        b = (n-4)/6;
                    else
                        b = (n-8)/6;
                if(b==0)
                    b=1;
                if(a==0)
                    a=1;
                System.out.printf("%l %l\n", b, a);                        
            }
            else
                System.out.println(-1);
        }
    }
    
}

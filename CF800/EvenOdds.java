import java.util.Scanner;

public class EvenOdds {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long k = scanner.nextLong();
        long j = -1;
        long a = 0;
        long g = 0;
        for(int i=0;i<x/2;i++){
            j+=2;
            if(i==k-1)
                g = j;
        }
        for(long i=x/2;i<x;i++){
            if(x%2!=0)
                a++;
            if(i==k-1)
                g = j;
        }
        System.out.println(g);
    }
}
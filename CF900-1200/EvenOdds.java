import java.util.Scanner;

public class EvenOdds {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long even = 0;
        if(n%2==0){
            if(k<=n/2)
                System.out.println(((k*2)-1));
            else{
                even = k - n/2;
                System.out.println(even*2);
            }
        }
        else{
            if(k<=(n/2)+1)
                System.out.println((k*2)-1);
            else{
                even = (k - n/2) - 1;    
                System.out.println(even*2);
            }
        }
    }
}
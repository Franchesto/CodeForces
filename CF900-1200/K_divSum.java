import java.util.Scanner;

public class K_divSum {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int a;
            if(n>k){
                if(n%k!=0)
                    a = (n/k)+1;
                else
                    a = n/k;
                k = k*a;            
            }
                System.out.println(k%n!=0 ? (k/n)+1 : k/n);
        }
    }
}

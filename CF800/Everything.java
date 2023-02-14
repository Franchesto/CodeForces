import java.util.Scanner;
import java.util.stream.*;

public class Everything {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int l;
        int sum = 0;
        int m;
        int x;
        int d = -1;
        int t = scanner.nextInt();
        for(int i=0; i<t; i++){
            int n = scanner.nextInt();
            int [] a = new int[n];
            for(int j=0; j<n; j++){
                int h = scanner.nextInt();
                a[j] = h;
                l = a.length;
                if(j==n-1){
                    sum = IntStream.of(a).sum();
                }
            }
            while(true){
                d++;
                m = (sum-a[d])/(n-1);
                x = sum-a[d];
                if(x%(n-1)==0 && m == a[d]){
                    System.out.println("YES");
                    d = -1;
                    break;
                }
                else if(d==n-1){
                    System.out.println("NO");
                    d = -1;
                    break;
                }     
            }
        }
        
        
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Promo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        for(int i=n-2;i>=0;i--){
            arr[i] += arr[i+1];
        }
        for(int i=0;i<q;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            long b = 0;
            long a = arr[n-x];
            if(x!=1 && y!=x)
                b = arr[(n-x)+y];
            System.out.println(x==1 ? arr[n-1] : a-b);
            
        }
    }
}

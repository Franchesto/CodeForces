import java.util.Arrays;
import java.util.Scanner;

public class Candies {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = 0;
        for(int i=0;i<n;i++){
            int p = scanner.nextInt();
            int z [] = new int[p];
            for(int j=0;j<p;j++){
                int x = scanner.nextInt();
                z[j] = x;
            }
            for(int h=0;h<p;h++){
                Arrays.sort(z);
                y += z[h] - z[0];
            }
            System.out.println(y);
            y = 0;
        }
    }
}

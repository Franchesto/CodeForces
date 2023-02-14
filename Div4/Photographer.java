import java.util.Arrays;
import java.util.Scanner;

public class Photographer {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n--> 0){
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int g = r*2, o = r;
            int a[] = new int[g];
            for(int i=0;i<g;i++){
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            for(int j=0;j<o;j++){
                g--;
                r--;
                int d = a[g] - a[r];
                if(d<x){
                    System.out.println("NO");
                    break;
                }
                else if(r==0)
                    System.out.println("YES");
            }
        }
    }    
}

import java.util.Scanner;

public class SimilarWords {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int g = 0;
            int sum = 10000;
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            String a[] = new String[x];
            int b[] = new int[x];
            for(int j=0;j<x;j++)
                a[j] = scanner.next();
            for(int p=0;p<x;p++){
                for(int q=p+1;q<x;q++){
                    g = 0;
                    for(int o=0;o<y;o++){
                        int z = Math.abs(a[p].charAt(o) - a[q].charAt(o));
                        g += z;
                    }
                    if(g<sum)
                        sum = g;
                }
            }
            System.out.println(sum);
        }
    }
    
}


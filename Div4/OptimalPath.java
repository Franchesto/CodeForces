import java.util.Scanner;

public class OptimalPath {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            long h = 0, a = 0;
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            for(int i=1;i<=m;i++){
                h+=i;
            }
            for(int j=2;j<=n;j++){
                a+=m*j;
            }
            System.out.println(a+h);
        }
    }
}

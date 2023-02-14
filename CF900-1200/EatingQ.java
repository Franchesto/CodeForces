import java.util.Arrays;
import java.util.Scanner;

public class EatingQ {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            int list[] = new int[n];
            for(int i=0;i<n;i++){
                list[i] = scanner.nextInt();
            }  
            Arrays.sort(list);
            for(int i=0;i<q;i++){
                int acl = 0, ans = 0;
                int s = scanner.nextInt();
                for(int j=n-1;j>=0;j--){
                    int a = list[j];

                    if(acl>=s) break;

                    acl += a;
                    ans++;
                    
                }

                System.out.println(acl < s ? -1 : ans);
            }
        }
    }
}
   

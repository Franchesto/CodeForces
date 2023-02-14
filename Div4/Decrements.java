import java.util.Scanner;

public class Decrements {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            long e = 0, q = 0, x = 0;
            boolean flag1 = false, flag2 = false;
            int l = scanner.nextInt();
            long a[] = new long[l];
            long b[] = new long[l];
            for(int i=0;i<l;i++){
                a[i] = scanner.nextLong();
            }
            for(int j=0;j<l;j++){
                b[j] = scanner.nextLong();
                if((b[j]!=0 || l==1) && a[j]>=b[j]){
                    q = a[j] - b[j];
                    if(q==0){
                        if(flag2 && x != a[j]){
                            flag1 = true;
                        }
                        x = a[j];
                        flag2 = true;
                    }
                }
            }
            for(int i=0;i<l;i++){
                if(b[i]==0 && a[i] <= q || a[i] - b[i] == q && !flag1){
                    e++;
                    if(e==l){
                        System.out.println("YES");
                        break;
                    }
                }
                else{
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}
import java.util.Scanner;

public class XORmixup {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int p = 0;
            int l = scanner.nextInt();
            int a[] = new int[l];
            for(int i=0;i<l;i++) {
                a[i] = scanner.nextInt();
            }
            for(int j=0;j<l;j++){
                for(int i=0;i<l;i++){
                    if(i!=j){
                        p^= a[i];
                    }
                }
                if(p==a[j]){
                    System.out.println(p);
                    break;
                }
                p = 0;
            }
        }
    }
}

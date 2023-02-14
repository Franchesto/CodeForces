import java.util.Scanner;

public class even {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int l;
        for(int i=0;i<t;i++){
            int h = -1;
            int q = 0;
            int w = 0;
            int e = 0;
            int r = 0;
            int n = scanner.nextInt();
            int []a = new int[n];
            if(n%2==0){
                l = n/2;
            }
            else{
                l = n/2+1;
            }
            for(int j=0;j<n;j++){
                int g = scanner.nextInt();
                a[j] = g;
            }
            for(int f : a){
                h++;
                if(h%2==0 && f%2==0){
                    q++;
                }
                else if(h%2==0 && f%2!=0){
                    w++;
                }
                else if(h%2==1 && f%2==1){
                    e++;
                }
                else if(h%2==1 && f%2==0){
                    r++;
                }
            }
            if(r+q>l || w+e>n/2){
                System.out.println(-1);
            }
            else if(q+e==n){
                System.out.println(0);
            }
            else {
                if((w+r)%2!=0){
                    System.out.println(w+r);
                }
                else{
                    System.out.println((w+r)/2);    
                }         
            }
        }
    }
}

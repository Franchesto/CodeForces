import java.util.Scanner;

public class Parkway {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);  
        int p = scanner.nextInt();
        while(p-->0){
            int j = 0;
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            for(int i =0;i<n;i++){
                int a = scanner.nextInt();
                if(m<=0)
                    j+=a;
                if(a>m)
                    j = a - m;
                m-=a;
            }
            System.out.println(j);
        }
    }
}

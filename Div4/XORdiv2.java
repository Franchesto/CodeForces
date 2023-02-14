import java.util.Scanner;

public class XORdiv2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int a = scanner.nextInt();
            long b = (long) (Math.log(a)/Math.log(2));
            long c;
            int x = 0;
            long i = (long) Math.pow(2, (b-1)) - 1;
            boolean flag = true;
            while(true){
                long g = (long) (Math.pow(2, b));
                c = g^((i*x));
                if(c==a && a!=1){
                    if(x==0){
                        System.out.printf("%d %d 0\n",g, x);
                        break;
                    }
                    else{
                        System.out.printf("%d %d 0\n",g, i);
                        break;
                    }
                }
                else if(i==g || a==1){
                    System.out.println(-1);
                    break;
                }
                else if(c>a){
                    System.out.println(-1);
                    break;
                }
                i++;
                if(flag){
                    x = 1;
                    flag = false;
                }
            }
        }
    }
    
}

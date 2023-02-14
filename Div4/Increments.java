import java.util.Scanner;

public class Increments {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int x = scanner.nextInt();
            int l[] = new int[x+1];
            for(int p=1;p<=x;p++)
                l[p] = scanner.nextInt();
            for(int j=1;j<=x;j++){
                if(j%2==0){
                    if(l[j]%2==0)
                        a++;
                    else
                        b++;
                    if(a>=1 && b>=1){
                        System.out.println("NO");
                        break;
                    }
                    else if(j==x){
                        System.out.println("YES");
                        break;
                    }
                }
                else{
                    if(l[j]%2==0){
                        c++;
                    }
                    else{
                        d++;
                    }
                    if(c>=1 && d>=1){
                        System.out.println("NO");
                        break;
                    }
                    else if(j==x){
                        System.out.println("YES");
                        break;
                    }
                }
            }
        }
}
}

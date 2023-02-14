import java.util.Scanner;

public class BWStripe {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String str = scanner.next();
            int ptnl = 0, ptnr = -1, ans = 0, min = 112345, resp = 112345;
            for(int i=0;i<n;i++){
                if(str.charAt(ptnl) == 'B'){
                    ptnr++;
                    if(str.charAt(ptnr) == 'W')
                        ans++;
                    else if(ans!=0) {
                        ptnl = ptnr; min = ans + ptnr - 1;
                        ans = 0;
                    }
                }
                if(min < resp)
                    resp = min;
                if(resp == k)
                    System.out.println(resp);
            } 
        }

    }
    
}

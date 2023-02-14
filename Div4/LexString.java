import java.util.Scanner;

public class LexString {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int i;
            int max = Integer.MAX_VALUE;
            int m = scanner.nextInt();
            int o = scanner.nextInt();
            int k = scanner.nextInt();
            StringBuilder sb = new StringBuilder(scanner.next());
            StringBuilder sb1 = new StringBuilder(scanner.next());
            while(sb.length()>0 || sb1.length()>0){
                for(i=0;i<m;i++){
                    if(sb.charAt(i) + 0 < max)
                        max = sb.charAt(i) + 0;
                }
                
            }
            
            
        }
    }
    
}

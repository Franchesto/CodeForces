import java.util.Scanner;

public class ConstrucStr {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int  t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = 97;
            b += 97;
            StringBuffer sbf = new StringBuffer();
            for(int j=0;j<n;j++){
                
                if(c==b) c = 97;
                sbf.append((char)c);
                c++;
            }

            System.out.println(sbf);
        }
    }
    
}

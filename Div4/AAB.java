import java.util.Scanner;

public class AAB {
    public static void main(String aegs[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int q = 0, b = 0;
            String a = scanner.next();
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)=='A')
                    q++;
                else
                    b++;
                if(b>q){
                    System.out.println("NO");
                    break;
                }
                else if(a.charAt(a.length()-1)=='A'){
                    System.out.println("NO");
                    break;
                }
                else if(i==a.length()-1){
                    System.out.println("YES");
                    break;
                }
            }
        }
    }
}

import java.util.Scanner;

public class B {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){   
            int l = scanner.nextInt();
            String a = scanner.next();
            String b = scanner.next();
            a = a.replace('G', 'B');
            b = b.replace('G', 'B');

            System.out.println(a.equals(b) ? "YES" : "NO");
        }
    }
    
}

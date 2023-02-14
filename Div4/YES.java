import java.util.Scanner;

public class YES {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            String s = scanner.next();
            System.out.println(s.compareToIgnoreCase("yes")==0 ? "YES" : "NO");
        }
    }
}

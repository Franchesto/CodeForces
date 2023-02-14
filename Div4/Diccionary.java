import java.util.Scanner;

public class Diccionary {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int c, d;
            String a = scanner.next();
            if(a.charAt(0)=='a')
                c = ((a.charAt(0)-'a')*25);
            else
                c = ((a.charAt(0)-'a')*25)+1;
            if(a.charAt(1) >= a.charAt(0)+1 && a.charAt(0)!='a')
                d = ((a.charAt(1)-'a')-1);
            else
                d = (a.charAt(1)-'a');
            System.out.println(c+d);
        }
    }
}

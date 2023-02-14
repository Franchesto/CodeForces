import java.util.Scanner;

public class hq9 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String p = scanner.next();
        if(p.contains("H") || p.contains("Q") || p.contains("9") || p.contains("9"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

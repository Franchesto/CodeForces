import java.util.Scanner;

public class domino {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x;
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        x = m*n/2;
        System.out.println(x);
    }
}

import java.util.Scanner;

public class StickGame {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(n<=m)
            System.out.println(n%2==0 && m>=n ? "Malvika" : "Akshat");
        else
            System.out.println(m%2==0 && n>=m ? "Malvika" : "Akshat");
    }
    
}

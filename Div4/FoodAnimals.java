import java.util.Scanner;

public class FoodAnimals {
    public static void main(String args[]){
        Scanner  scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            a -= x;
            b -= y;
            if(a>=0 && b>=0)
                System.out.println("YES");
            else{
                if(a>0)
                    a = 0;
                if(b>0)
                    b = 0;
                System.out.println((Math.abs(a+b)<=c) ? "YES" : "NO");   
            }   
        }
    }
}

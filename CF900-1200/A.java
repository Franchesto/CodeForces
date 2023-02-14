import java.util.Scanner;

public class A {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int l = scanner.nextInt();
            String str = scanner.next();
            if(str.contains("T") && str.contains("i") && str.contains("u") && str.contains("m") && str.contains("r") && str.length()==5)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
}

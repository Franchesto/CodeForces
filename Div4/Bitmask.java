import java.util.Scanner;

public class Bitmask {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int a = scanner.nextInt();
            String b = Integer.toBinaryString(a);
            int c = b.length() - b.lastIndexOf("1");
            System.out.println(b.indexOf("1")>c ? (int) (Math.pow(2, c)) : (int) Math.pow(2, c)+1);
        }
    }
    
}

import java.util.Scanner;

public class Bills {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int cem = x % 100;
        int vinte = cem%20;
        int dez = vinte%10;
        int cinco = dez%5;
        System.out.println((x/100)+(cem/20)+(vinte/10)+(dez/5)+cinco/1);
    }
}

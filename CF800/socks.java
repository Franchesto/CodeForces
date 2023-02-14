import java.util.Scanner;

public class socks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = -1;
        int q = 0;
        while(true){
            d++;
            if(a-d!=0 && b-d!=0){
                q++;
            }
            else{
                break;
            }
        }
        System.out.print(q+" "+((a - q) + (b - q))/2);
    }
}
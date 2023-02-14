
import java.util.Scanner;
public class Way {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for(int i=0; i<q; i++){
        String x = scanner.next();
        int y = x.length();
        if(y>10){
             int z = y-2;
             char a = x.charAt(0);
             char b = x.charAt(y-1);
            System.out.print(a);
            System.out.print(z);
            System.out.println(b);
            }
        else{
            System.out.println(x);
        }
    }
        scanner.close();
        



    




    }
}

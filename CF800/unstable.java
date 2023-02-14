import java.util.Scanner;

public class unstable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        
        for(int i =0;i<b;i++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            switch(n){
                case(1):
                    System.out.println(0);
                    break;
                case(2):
                    System.out.println(m);
                    break;
                default:
                    System.out.println(m*2);    
                    break;    
            }
        }  
    }
}

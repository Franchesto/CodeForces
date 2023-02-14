import java.util.Scanner;

public class array {
    
    

    public static void main (String[] args) {        
    
        Scanner scanner = new Scanner(System.in);
        int [] x = new int[4];
        for(int i = 0; i<=3; i++){
            int y = scanner.nextInt();
            x[i] = y;
            System.out.println(x[i]);    
            }
        scanner.close();
 

    }
}

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int y;
        int z;
        int x = scanner.nextInt();
        if(x%5==0){
            System.out.println(x/5);
        }    
        else{
        z = x/5;
        System.out.println(z+1);
        }
    
    }
}

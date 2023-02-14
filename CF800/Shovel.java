import java.util.Scanner;

public class Shovel {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        int i = 0;
        while(true){
            i++;
            if(k*i%10==r){
                System.out.println(i);
                break;
            }
            else if(k*i%5==0 && k%i!=r){
                if(k*i%10==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

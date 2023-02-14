import java.util.Scanner;

public class banana {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int j;
        int l = 0;
        for(int i=1; i<=w; i++){
            j = k*i;
            l += j;
        }
        int z = l - n;
        if(z>0){
            System.out.println(z);
        }
        else{
            System.out.println(0);
        }
    }   
}

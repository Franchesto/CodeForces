import java.util.Scanner;

public class NewYear {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int max = 0;
        int j = 0;
        for(int i=1;i<=n;i++){
            max += i*5;
            if(k+max<=240){
                j++;
            }
        }
        System.out.println(j);
    }
}

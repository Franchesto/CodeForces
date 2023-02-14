import java.util.Scanner;

public class Candies2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int max=0, max2=0;
            int l = scanner.nextInt();
            for(int i=0;i<l;i++){
                int a = scanner.nextInt();
                if(a>=max){
                    max2 = max;
                    max = a;
                }
                else if(a>max2){
                    max2 = a;
                }
            }
            System.out.println(max-max2>=2 ? "NO" : "YES");
        }
    }
    
}

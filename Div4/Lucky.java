import java.util.Scanner;

public class Lucky {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int p=0;p<n;p++){
            int a = 0;
            int b = 0;
            String j = scanner.next();
            for(int i=0;i<=5;i++){
                if(i<3)
                    a += j.charAt(i) - '0';
                else
                    b += + j.charAt(i) - '0';
            }
            if(a==b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

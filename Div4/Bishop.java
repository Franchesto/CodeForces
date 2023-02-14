import java.util.Scanner;

public class Bishop {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int j = 0;
        for(int p=0;p<n;p++){
            int g =0;
            int a = 0;
            int b = 0;
            for(int i=0;i<8;i++){
                String chess = scanner.next();
                for(int h=0;h<8;h++){
                    if(chess.charAt(h) == '#')
                        j++;
                }
                if(j==1 && g ==2 && a==0){
                    a = i;
                    b = chess.indexOf("#");
                }
                g = j;
                j = 0;    
            }
            System.out.printf("%d %d\n", a+1, b+1);
        }
    }
}
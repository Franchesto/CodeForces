import java.util.Scanner;

public class dibisiblw {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int n = scanner.nextInt();
        int f = 0;
        for(int i=0; i<n; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            if(a%b==0){
                System.out.println(0);
            }
            else{
                if(a<b){
                    int x = -a + b;
                    System.out.println(x);
                    x = 0;
                }
                else{
                    while(true){
                        f++;
                        int x = (a+f)%b;
                        if(x==0){
                            System.out.println(f);
                            f = 0;
                            break;
                        }
                    }
                }
            }
        }   
    }
}

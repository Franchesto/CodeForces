import java.util.Scanner;

public class Marathon {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int h = 0;
        for(int i=0;i<x;i++){
            int a = scanner.nextInt();
            for(int j=0;j<3;j++){
                int b = scanner.nextInt();
                if(a<b)
                    h++;
            }
            System.out.println(h);
            h = 0;
        }
    }
}

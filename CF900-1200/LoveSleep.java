import java.util.Scanner;

public class LoveSleep {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int ansh = 0, ansm = 0, hmax = -1;
        while(t-->0){
            int n = scanner.nextInt();
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            for(int i=0;i<n;i++){
                int h1 = scanner.nextInt();
                int m1 = scanner.nextInt();    
                ansh = h1 - h; 
                ansm = m1 - m;
                if(ansh <= 0) ansh += 24;
                if(ansm < 0){ 
                    ansm += 60;
                    ansh -= 1;
                }
                if(ansh == 24) hmax = 0;

            }
            if(hmax == 0)
                System.out.printf("%d %d\n", hmax, ansm);
            else
                System.out.printf("%d %d\n", ansh, ansm);
        }
    }
    
}

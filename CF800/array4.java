import java.util.Scanner;

public class array4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x;
        int pa = 0;
        int ip = 0;
        int [] pr = new int[5];
        int [] im = new int[5];
        for(int i=0; i<15; i++){
            x = scanner.nextInt();
            if(x%2==0){
                pr[pa] = x;
                pa++;                
            }
            else{
                im[ip] = x;
                ip++;
            }
            if(pa >= 5){
                int c = 0;
                while(c < pa){
                    System.out.printf("\nPAR [%d] = " + pr[c], c);
                c++;
            }
                pa = 0;
            }
            if(ip >= 5){
                int d = 0;
                while(d < ip){
                    System.out.printf("\nIMPAR [%d] = " + im[d], d);
                d++;
                }
                ip = 0;
            }
            }
        }
}


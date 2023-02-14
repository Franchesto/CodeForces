import java.util.Scanner;
public class Next {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] an = new int[n];
        int a;
        int l = 0;
        int g = 0;
        for(int i=0;i<n;i++){
            a = scanner.nextInt();
            an[i] = a;
        }
        for(int j : an){      
            if(j >= an[k-1] && an[g] > 0){
                l++;
            }
            g++;
        }
        System.out.println(l);
    }
}
        
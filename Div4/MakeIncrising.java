import java.util.Scanner;

public class MakeIncrising {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int g = 0;
            boolean flag = false;
            int l = scanner.nextInt();
            int l1 [] = new int[l];
            for(int i=0;i<l;i++){
                l1[i] = scanner.nextInt();
            }
            for(int i=l-1;i>0;i--){
                if(l1[i-1]>=l1[i]){
                    while(l1[i-1]>=l1[i] && l1[i-1] > 0){
                        l1[i-1]/=2;
                        g++;
                    }
                    }
                if(l1[i]==l1[i-1]){
                    flag = true;
                }
            }
        System.out.println(flag ? -1 : g);

        }
    }
}
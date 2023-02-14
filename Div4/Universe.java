import java.util.Scanner;

public class Universe {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int h = 0;
            boolean flag = false;
            int l = scanner.nextInt();
            int l1 [] = new int [l];
            for(int i=0;i<l;i++){
                l1[i] = scanner.nextInt();
                if(l1[i] == 0){
                    flag = true;
                }
            }       
            for(int j=0;j<l;j++){
                if(j<l-1 && l1[j] == 0 && l1[j+1] !=0)
                    h++;
                if(j==0 && l1[j] != 0)
                    h++;
            }
            if(!flag)
                System.out.println(1);
            else if(h<=1)
                System.out.println(h);
            else
                System.out.println(2);

        }
    }
}
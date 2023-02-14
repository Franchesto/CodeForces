import java.util.Scanner;

public class arrayfill {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] even = new int[5];
        int [] odd = new int[5];
        int j = 0;
        int k = 0;
        for(int i=0;i<15;i++){
            int x = scanner.nextInt();
            if(x%2==0){                 
                even[j] = x;
                System.out.printf("par[%d] = %d\n", j, even[j]);
                j++;
                if(j==5){
                    j=0;
                }
            }
            else{
                odd[k] = x;
                System.out.printf("impar[%d] = %d\n", k, odd[k]);
                k++;
                if(k==5){
                    k = 0;
                }    
            }
        }
    } 
}

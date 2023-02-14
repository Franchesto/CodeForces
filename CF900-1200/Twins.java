import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int array [] = new int[c];
        int y = 0;
        int l = 0;
        int j = 0;
        for(int i=0;i<c;i++){
            int x = scanner.nextInt();
            array[i] = x;
            y += x;
        }
        Arrays.sort(array);
        while(c-- >= 0){
            j += array[c];
            l++;
            if(j>y/2){
                System.out.println(l);
                break;
            }
        } 
    }
}

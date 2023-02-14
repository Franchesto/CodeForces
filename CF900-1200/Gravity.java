import java.util.Scanner;

public class Gravity {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int array [] = new int[c];
        int p = 0;
        int l = c;
        int a = c;
        for(int i=0;i<c;i++){
            int x = scanner.nextInt();
            array[i] = x;
        }
        for(int b=0;b<c;b++){
            while(--c >= 1){
                int j = array[c-1]-array[c];
                if(j>0){
                    array[c-1] = array[c-1] - j;
                    array[c] = array[c] + j;
                }
                a--;
                if(a>=2 &&array[a]>=array[(a-1)])
                    p++;
            }
            if(p==l-1)
                break;
            else
                c = l;
        }
        for (int i : array)
            System.out.printf("%d ", i);
    }
}

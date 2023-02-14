import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[6];
            for(int j=0;j<6;j++){
                int x = scanner.nextInt();
                a[j] = x;
                int i = j - 1;
                while(i>=0 && a[i] > x){
                    a[i + 1] = a[i];
                    i = i -1;
                }
                a[i+1] = x;
            }
        for (int c : a) {
            System.out.println(c);
            
        }
    }
}

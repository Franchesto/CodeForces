import java.util.Scanner;

public class FavSequence {

    public static int[] pointers(int arr[]){
        int l = 0, r = -1, inter[] = new int[arr.length], l1 = arr.length - 1, q = 0;
        for(int j=0;j<arr.length;j++){ 
            r+=2;
            if(q>=arr.length)
                break;
            inter[q] = arr[l];
            if(r>=arr.length)
                break;
            inter[r] = arr[l1];
            l1--;
            l++;
            q+=2;
        }
        return inter;

    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int l = scanner.nextInt();
            int arr[] = new int[l];
            for(int i=0;i<l;i++){
                arr[i] = scanner.nextInt();
            }
            for (int i : pointers(arr)) {
                System.out.printf("%d ", i);
            }
            System.out.println("");
        }
    }
    
}

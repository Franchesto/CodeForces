import java.util.HashMap;
import java.util.Scanner;

public class triple {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int l = scanner.nextInt();
            int a[] = new int[l];
            for(int j=0;j<l;j++){
                a[j] = scanner.nextInt();
            }
            HashMap<Integer, Integer> happy = new HashMap<Integer, Integer>();
            for(int j=0;j<l;j++){
                happy.put(a[j], happy.getOrDefault(a[j], 0)+1);
                if(happy.get(a[j])>=3){
                    System.out.println(a[j]);
                    break;
                }
                else if(j==l-1)
                    System.out.println(-1);
            }
        }
    }
    
}

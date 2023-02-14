import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class SaveMice {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int ans = 0, cont = 0;
            Queue<Integer> qe = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<k;i++){
                qe.add(scanner.nextInt());
            }
            for(int i=0;i<k;i++){
                int a = qe.peek();
                if(cont>=a)
                    break;
                qe.remove(a);
                int s = n - a;
                cont += s;
                ans++;
            }
            System.out.println(ans);

        }
    }
}

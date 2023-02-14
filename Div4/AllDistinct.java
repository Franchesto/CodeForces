import java.util.ArrayList;
import java.util.Scanner;
public class AllDistinct {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        ArrayList numUni = new ArrayList<Integer>();
        for(int i=0;i<x;i++){
            int y = scanner.nextInt();
            int z [] = new int[y];
            for(int j=0;j<y;j++){
                int a = scanner.nextInt();
                z[j] = a;
                if(!numUni.contains(z[j]))
                    numUni.add(z[j]);
            }
        int h = y - numUni.size();
        if(h%2==0)
            System.out.println(numUni.size());
        else
            System.out.println(numUni.size()-1);
        numUni.clear();
        }
    }
}

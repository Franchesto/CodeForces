import java.util.ArrayList;
import java.util.Scanner;
public class AllDistinct {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int h = 0;
        ArrayList numRep = new ArrayList<Integer>();
        int g = 0;
        for(int i=0;i<x;i++){
            int y = scanner.nextInt();
            int z [] = new int[y];
            for(int j=0;j<y;j++){
                int a = scanner.nextInt();
                z[j] = a;
            }
        for(int o=0;o<y;o++){
            if(!numRep.contains(z[o]))
            numRep.add(z[o]);
        }
            h = numRep.size();
            if(y%2==0){
                System.out.println(numRep.size());
            }
            else
                System.out.println(numRep.size()-1);
            numRep.clear();
            }
    }
}

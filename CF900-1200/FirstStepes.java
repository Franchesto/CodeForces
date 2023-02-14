import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FirstStepes {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j [] = new int[i];
        List<Integer> list = new ArrayList<Integer>();
        int h = 0;
        int z = 0;
        for(int g =0;g<i;g++){
            int a = scanner.nextInt();
            j[g] = a;
        }    
        for (int l : j) {
            z++;
            if(z<i && l<=j[z]){
                h++;
            }
            else{
                list.add(h);
                h = 0;
            }
        }
        System.out.println(Collections.max(list)+1);
    }
}

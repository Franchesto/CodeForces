import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class twoGran {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        String s = scanner.next();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<l-1;i++){

            if(map.put(s.substring(i, i+2), map.get(s.substring(i, i+2))) == null)
                map.put(s.substring(i, i+2), 1);

            else
                map.put(s.substring(i, i+2), map.get(s.substring(i, i+2))+1);

        }
        int q = 0;
        String w = "AB";
        Set<String> keys = map.keySet();
        for (String st : keys) {
            if(map.get(st)>q){
                q = map.get(st);
                w = st;
            }
        }
        System.out.println(w);
    }
    
}

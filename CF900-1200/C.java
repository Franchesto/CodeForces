import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class C {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            Map<String, Integer> set = new HashMap<>();
            int cnta = 0, cntb = 0, cntc = 0;
            int n = scanner.nextInt();
            n*=3;
            for(int i=1;i<=n;i++){
                String str = scanner.next();
                if(i<=n/3){
                    set.put(str, 3);
                    continue;
                }
                else if(i<=(n*2)/3 && i>n/3){
                    if(set.get(str) != null){
                        set.put(str, 1);
                        cnta +=2;
                        cntb +=2;
                    }
                    else set.put(str, 2);
                }    
                else if(set.get(str) == null)
                    set.put(str, 3);
                else{
                    if(set.get(str) == 1){
                        set.put(str, 0);
                        cnta++; cntb++; cntc+=3;
                    }
                    else{
                        if(set.get(str)==2){
                            cntb+=2; cntc+=2;
                        }
                        else{
                            cnta+=2; cntc+=2;
                        }   
                    }
                }
            }
            System.out.printf("%d %d %d \n", n-cnta, n-cntb, n-cntc);
        }
    }
    
}

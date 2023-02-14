import java.util.Scanner;
import java.util.TreeSet;

public class D {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            StringBuilder stb = new StringBuilder(scanner.next());
            long lcnt = 0, rcnt = 0, cnt;
            TreeSet<Integer> ltre = new TreeSet<>();
            TreeSet<Integer> rtre = new TreeSet<>();
            for(int j=0;j<n;j++){
                if(stb.charAt(j) == 'L'){
                    lcnt+=j;
                    ltre.add(j);
                }
                else{
                    rcnt += n - j - 1;
                    rtre.add(j);
                }
            }
            cnt = lcnt + rcnt;
            long max = cnt;
            n-=1;
            for(int i=0;i<n+1;i++){
                //int lio = stb.lastIndexOf("R");
                //int io = Math.abs(stb.indexOf("L"));
                int lio = 0, io = 0;
                if(!rtre.isEmpty())
                    lio = rtre.last();
                if(!ltre.isEmpty())
                    io = ltre.first();                
                if(lio >= n-io){
                    //stb.replace(lio, lio+1, "L");
                    ltre.add(lio);
                    rtre.remove(lio);
                    cnt += lio - (n-lio);
                    if(cnt>max) max = cnt;
                    System.out.printf("%d ", max);
                }
                else{
                    //stb.replace(io, io+1, "R");
                    rtre.add(io);
                    ltre.remove(io);
                    cnt += (n - io) - io;
                    if(cnt>max) max = cnt;
                    System.out.printf("%d ", cnt);
                } 
            }
            System.out.println();
        }   
    }   
}
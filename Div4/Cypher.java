import java.util.Scanner;

public class Cypher {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int w = scanner.nextInt();
            int l[] = new int[w];
            for(int i=0;i<w;i++){
                l[i] = scanner.nextInt();
            }
            for(int j=0;j<w;j++){
                int a = scanner.nextInt();
                String s = scanner.next();
                for(int i=0;i<a;i++){
                    if(s.charAt(i)=='D'){
                        l[j]+=1;
                        if(l[j]==10)
                            l[j]=0;
                    }
                    else{
                        l[j]-=1;
                        if(l[j]==-1)
                            l[j]=9;
                    }
                }
            }
            for (int k : l)
                System.out.printf("%d ",  k);
            System.out.println("");
        }
    }
}

import java.util.Scanner;

public class VasyaPointers {

    public static int pointers(char c, int n, int k, String s){
        int l = 0, r = 0, cnt = 0, ret = 0;
        for(l=0;l<n;l++){
            while(r<n && (cnt < k || s.charAt(r) != c)){
                if(s.charAt(r) == c)
                    cnt++;
                r++;
            }

            if(s.charAt(l) == c)
                cnt--;

            if(ret < r-l)
                ret = r-l;
        }
        return ret;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String vetor = scanner.next();

        int ansa = pointers('a', n, k, vetor);
        int ansb = pointers('b', n, k, vetor);
        int ans = ansa;

        if(ansb > ansa)
            ans = ansb;

        System.out.println(ans);

    }
}

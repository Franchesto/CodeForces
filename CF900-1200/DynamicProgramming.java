//botton-up
public class DynamicProgramming {
    static int fib(int n){
        int f[] = new int[n+2];
        f[1] = 1;
        f[2] = 1;
        for(int i=3;i<=n;i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];    
    }
    public static void main(String args[]){
        int n = 50;
        System.out.println(fib(n));
    }
}

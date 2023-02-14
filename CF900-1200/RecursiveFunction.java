public class RecursiveFunction {
    public static int fact(int n){
        if(n >= 1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String args[]){
        int na = 10;
        for(int i=1;i<=na;i++)
            System.out.println(fact(i));
    }
}

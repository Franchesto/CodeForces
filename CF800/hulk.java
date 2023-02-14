import java.util.Scanner;

public class hulk {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for(int i=1; i<=n; i++){
            String p = "I hate that";
            String v = "I love that";
            String g = "I love it";
            String h = "I hate it";
            if(n==1){
                System.out.print(h);
                break;
            }    
            if(i%2==1){
                System.out.print(p+" ");
            }
            else{
                System.out.print(v+" ");
            }
            if(i==n-1 && n%2==0){
                System.out.print(g);
                break;
            }
            if(i==n-1 && n%2==1){
                System.out.print(h);
                break;
            }  
        }           
    }
}   

import java.util.Scanner;

public class Footbal {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        int j = 1;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==x.charAt(i+1))
                j++;    
            else
                j = 1;       
            if(j==7){
                System.out.println("YES");
                break;
            }
            if(i==-2+x.length()){
                System.out.println("NO");
                break;
            }
        }
    }
}

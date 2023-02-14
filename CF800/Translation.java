import java.util.Scanner;

public class Translation {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next(); 
        int h = x.length() -1;
        for(int i=0;i<x.length();i++){
            if(x.length()!=y.length()){
                System.out.println("NO");
                break;
            }
            else if(x.charAt(i)==y.charAt(h)){;
                if(h==0)
                    System.out.println("YES");
            }
            else{
                System.out.println("NO");
                break;
            }
            h--;
        }
    }
}

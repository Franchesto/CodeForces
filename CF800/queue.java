import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument;

public class queue {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //int n = scanner.nextInt();
    //int t = scanner.nextInt();
    String s = scanner.next();
        int n = s.length();
        for(int i=0;i<=n;i+=2)
            for(int j=0;j<n;j+=2){     
                if(s.valueOf(i).equals(s.valueOf(j))){
                    
                }
            }
}
}

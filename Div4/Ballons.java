import java.util.ArrayList;
import java.util.Scanner;

public class Ballons {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int a = scanner.nextInt();
            ArrayList<Character> list = new ArrayList<Character>();
            String s = scanner.next();
            for(int i=0;i<s.length();i++){
                if(!list.contains(s.charAt(i)))
                    list.add(s.charAt(i));
            }
            System.out.println(s.length()>list.size() ? (s.length()-list.size())+list.size()*2 : list.size()*2);
        }
    }
}

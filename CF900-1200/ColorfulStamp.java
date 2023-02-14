import java.util.Scanner;

public class ColorfulStamp {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int l = scanner.nextInt();
            String str = scanner.next();
            int cnt = 0, pont = 0, cnw = 0;
            boolean flag = true;
            for(int i=0;i<l;i++){
                char clr = str.charAt(i);
                if(clr =='W' || i == l-1)
                    cnt = i;


                if(str.substring(pont, cnt).contains("B") && str.substring(pont, cnt).contains("R")){
                    pont = i + 1;
                    cnt ++;
                }
                else if(((cnt != 0 && pont != cnt) || l == 1) && !str.substring(pont, cnt).contains("W")){
                    flag = false;
                    pont = i;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
    
}

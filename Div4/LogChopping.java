import java.util.Scanner;

public class LogChopping {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 0;
        for(int i=0;i<n;i++){
            int l = scanner.nextInt();
            for(int j=0;j<l;j++){
                int length = scanner.nextInt();
                z += (length-1);
            }
            if(z%2!=0){
                System.out.println("errorgorn");
            }
            else{
                System.out.println("maomao90");
            }
            z = 0;
        }
    }
}

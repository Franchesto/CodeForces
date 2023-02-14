import java.util.Scanner;

public class easy {

    public static void main(String[] args){
        boolean t = false;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int j = scanner.nextInt();
            if(j==1){
                t = true;
            }
        }
        if(t==true){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}

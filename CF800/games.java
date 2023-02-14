import java.util.Scanner;

public class games {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] u = new int[n][2];
        int uh;
        int ug;
        int r = 0;
        int g = 0;
        for(int i=0; i<n; i++){
            uh = scanner.nextInt();
            ug = scanner.nextInt();
            u[i][0] = uh;
            u[i][1] = ug;
        }
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                if(u[g][0] == u[k][1]){
                    r++;
                }
            }           
            if(g==n-1){
                g = 0;
            }
            g++;
        }
        System.out.println(r);  
    }
}

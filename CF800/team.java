import java.util.Scanner;

public class team {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 0;
        int u = 0;
        int [] x = new int[3];
        for(int i=0; i<n; i++){
            x[0] = scanner.nextInt();
            x[1] = scanner.nextInt();
            x[2] = scanner.nextInt();
        for(int j : x){
            if(j==1){
            z++;            
            }
        }    
        if(z>=2){
            u++;
        }
            z=0;   
        } 
        System.out.println(u);    
        
    }
}



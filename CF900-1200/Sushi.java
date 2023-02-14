import java.util.Scanner;

public class Sushi {

    public static int pointers(int arr[], int n, int a){
        int r = 0, ans = 0, t = 0;
        for(int l=0;l<n;l++){
            int h = 0; 
            
            if(l>=r)
                r = l;

             while(r<n && h<=t){
                if(arr[r] != a)
                    h++;
                else if(h>=1)
                    break;
                else
                    t++;
                r++;

                if(ans < h)
                    ans = h;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();            
        }
        int ansa = pointers(arr, n, 2);
        int ansb = pointers(arr, n, 1);
        int ans = ansa;

        if(ansb > ans)
            ans = ansb;
            
        System.out.println(ans);
        
    }
    
}

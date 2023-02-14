import java.util.Scanner;

public class NITorz {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int max =  Integer.MIN_VALUE;
            int l = scanner.nextInt();
            int a [] = new int[l];
            int z = scanner.nextInt();
            for(int i=0;i<l;i++){
                a[i] = scanner.nextInt();
            }
            for(int j=0;j<l;j++){
                int OR = a[j] | z;
                int AND = a[j] & z;
                if(OR>max){
                    max = OR;
                }
            }
            System.out.println(max);
        }
    }
}

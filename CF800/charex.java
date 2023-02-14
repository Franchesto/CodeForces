import java.util.Scanner;

public class charex{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char []t = new char[5];
        for(int i=0;i<5;i++){
            char g = scanner.next ().charAt(0);
            t[i] = g;
        }
        System.out.println(t);
    }
} 
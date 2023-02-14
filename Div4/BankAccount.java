import java.util.Scanner;

public class BankAccount {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String state = scanner.next();
        StringBuilder sb = new StringBuilder(state);
        StringBuilder sb2 = new StringBuilder("-0");
        if(state.contains("-")){
            if(state.length()==2){
                System.out.println(0); 
            }   
            else if(state.charAt(state.length()-1)>=state.charAt(state.length()-2)){
                sb = sb.deleteCharAt(state.length()-1);
                if(sb.toString().equals(sb2.toString()))
                    sb.deleteCharAt(0);
                System.out.println(sb);
            }
            else{
                sb = sb.deleteCharAt(state.length()-2);
                if(sb.toString().equals(sb2.toString()))
                    sb.deleteCharAt(0);
                System.out.println(sb);
            }
        }
        else
            System.out.println(state);
    }    
}

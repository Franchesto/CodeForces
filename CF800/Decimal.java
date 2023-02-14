import java.util.Scanner;
public class Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double r = scanner.nextDouble();
        double pi = 3.14159;
        double v = (4.0/3)*pi*(r*r*r);
        System.out.format("VOLUME = "+"%.3f", v);
        scanner.close();
    
        }
    }


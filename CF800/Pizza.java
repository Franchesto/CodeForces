import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double r;
        double h;
        double l;
        while (true) {
            cont += 1;
            r = sc.nextDouble();
            if (r == 0)
                break;
            h = sc.nextDouble();
            l = sc.nextDouble();
            if (h*h > r*r*4 - l*l) {
                System.out.println("Pizza " + cont + " does not fit on the table.");

            } else {
                System.out.println("Pizza " + cont + " fits on the table.");
            }

        }

    }

}
import java.util.ArrayList;
import java.util.Scanner;

public class Year {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        x++;
        while (true)
        {
            long tmp = x;
            ArrayList<Long> arr = new ArrayList<Long>();
            while (tmp != 0)
            {
                arr.add(tmp % 10);
                tmp /= 10;
            }
            int cont = 0;
            for (Long a : arr)
                for (Long b : arr)
                    if(a.equals(b))
                        cont++;
            if (cont == arr.size())
            {
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}
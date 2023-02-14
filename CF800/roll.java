import java.util.Scanner;

public class roll{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int z = scanner.nextInt();
        roll r = new roll();
        Denom teste = r.new Denom(x, z);
        teste.calculo();
        teste.fatoracao();
    }

    class Denom{
        
        private int x;
        private int z;
        int i = 0;
        int s;
        
        public Denom(int x, int z){
            this.x = x;
            this.z = z;
        }

        public void calculo(){
            if(this.x>this.z){
                s = 6 - this.x;
                s += 1;
            }
            else{
                s = 6 - this.z;
                s += 1;
            }
        }
        public void fatoracao(){
            if(s%2==0 && s%3!=0){
                s = s/2;
                System.out.printf("%d/%d", s, 6/2);
            }
            else if(s%3==0 && s%6!=0){
                s = s/3;
                System.out.printf("%d/%d", s, 6/3);
            }
            else if(s%6==0){
                s = s/6;
                System.out.printf("%d/%d", s, 1);
            }   
            else{
                System.out.printf("%d/%d", s, 6);
            }

        }
    }
}
package SimUpato;

public class Mallarduck extends Duck{
    public Mallarduck(){
        quackBehavior = new Quack();
        flyBehavior = new FlywithWwings();
    }

    public void display(){
        System.out.println("im a real Mallardduck");
    }
    
}

package SimUpato;

public class DuckHunter extends HumanQuack{
    QuackBehavior humanQuack;

    public DuckHunter(){
        humanQuack = new HumanQuack();
    }
    
    public void display(){
        System.out.println("Just a normal human");
    }
}

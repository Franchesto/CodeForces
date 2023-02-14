package SimUpato;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Sem som");
    }
}
package SimUpato;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}
    
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void display(){
    System.out.println("Display duck");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setflybehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }
    public void setquackbehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }

}

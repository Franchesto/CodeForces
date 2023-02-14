package SimUpato;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlynoWay();
        quackBehavior = new Quack();
    }    
    public void display(){
        System.out.println("Im a model duck");
    }
}

package SimUpato;

public class MiniduckSimuilator {
    public static void main(String args[]){
        Duck mallard = new Mallarduck();
            mallard.performQuack();
            mallard.performFly();
            mallard.setflybehavior(new FlynoWay());
            mallard.performFly();
            mallard.display();

        Duck rocket = new ModelDuck();
            rocket.performFly();
            rocket.performQuack();
            rocket.setflybehavior(new FlyRocketPower());
            rocket.performFly();

        DuckHunter human = new DuckHunter();
            human.display();
            human.quack();
    }
}

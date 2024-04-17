
public class DuckSim {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.setFlyBehaviour(() -> System.out.println("This particular Duck is flying upside down"));
        mallardDuck.performFly();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.setFlyBehaviour(new FlyWithWings());
        redheadDuck.performFly();


        mallardDuck.performSwim();
        mallardDuck.setSwimBehaviour(new NoSwim());
        mallardDuck.performSwim();

        redheadDuck.setSwimBehaviour(new FloatOnWater());
        redheadDuck.performSwim();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performSwim();
        rubberDuck.performFly();

    }

}

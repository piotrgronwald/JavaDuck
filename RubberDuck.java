public class RubberDuck extends Duck {
    public RubberDuck() {
        setSwimBehaviour(new NoSwim());
        setFlyBehaviour(new NoFly());
    }

    @Override
    public void display() {
        System.out.println("This is RubberDuck");
    }

}

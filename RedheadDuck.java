public class RedheadDuck extends Duck{

    public RedheadDuck() {
        setFlyBehaviour(new NoFly());
        setSwimBehaviour(new FloatOnWater());
    }

    @Override
    public void display() {
        System.out.println("This is RedheadDuck");
    }
}

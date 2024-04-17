public class MallardDuck extends Duck{

    public MallardDuck() {
        setFlyBehaviour(new FlyWithWings());
        setSwimBehaviour(new FloatOnWater());
    }

    @Override
    public void display() {
        System.out.println("This is MallardDuck");
    }
}

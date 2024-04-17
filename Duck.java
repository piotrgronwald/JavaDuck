public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private SwimBehaviour swimBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
}

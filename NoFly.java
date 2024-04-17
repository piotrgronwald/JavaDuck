import java.util.NavigableMap;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying is impossible");
    }
}

package SOLID.V5;

import SOLID.V4.Bird;
import SOLID.V4.Flyable;

public class Sparrow extends Bird implements Flyable {
    FlyingBehavior flyingBehavior;

    public Sparrow(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void fly() {
        flyingBehavior.doFlying();
    }

    @Override
    public void makeSound() {
        System.out.println("Chu Chu");
    }
}

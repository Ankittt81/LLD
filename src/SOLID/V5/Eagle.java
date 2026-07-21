package SOLID.V5;

import SOLID.V4.HighFlying;

public class Eagle extends Bird implements Flyable {
    private FlyingBehavior flyingBehavior;

    Eagle(FlyingBehavior flyingBehavior) {
       this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle Making Sound");
    }

    @Override
    public void fly() {
        flyingBehavior.doFlying();
    }
}
//Achieve Dependency Inversion by connecting two concrete class via interface
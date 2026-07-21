package SOLID.V4;

public class Sparrow extends Bird implements Flyable {
    LowFlying lowFlying;

    public Sparrow(){
        lowFlying = new LowFlying();
    }

    @Override
    public void fly() {
        lowFlying.lowFly();
    }

    @Override
    public void makeSound() {
        System.out.println("Chu Chu");
    }
}

package SOLID.V6;

public class Sparrow extends Bird implements FlyingDance {
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void dance() {

    }

    @Override
    public void makeSound() {
        System.out.println("Chu Chu");
    }
}

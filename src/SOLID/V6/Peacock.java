package SOLID.V6;

public class Peacock extends Bird implements FlyingDance {
    @Override
    public void fly() {
        System.out.println("Peacock flying");
    }

    @Override
    public void dance() {

    }

    @Override
    public void makeSound() {
        System.out.println("EWWW EWWW");
    }
}

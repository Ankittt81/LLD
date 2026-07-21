package SOLID.V2;

public class Peacock extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Peacock flying");
    }
    @Override
    public void makeSound() {
        System.out.println("EWWW EWWW");
    }
}

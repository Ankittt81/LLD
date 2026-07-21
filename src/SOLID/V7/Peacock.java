package SOLID.V7;

public class Peacock extends Bird implements Flyable,Dancing {
    @Override
    public void fly() {
        System.out.println("Peacock flying");
    }
    @Override
    public void makeSound() {
        System.out.println("EWWW EWWW");
    }

    @Override
    public void dance() {

    }
}

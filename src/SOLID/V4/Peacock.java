package SOLID.V4;

public class Peacock extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Peacock flying");
    }
    @Override
    public void makeSound() {
        System.out.println("EWWW EWWW");
    }
}

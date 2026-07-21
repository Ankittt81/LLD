package SOLID.V5;

import SOLID.V4.Bird;
import SOLID.V4.Flyable;

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

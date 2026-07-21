package SOLID.V2;

public class Sparrow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chu Chu");
    }
}

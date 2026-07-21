package SOLID.V1;

public class Sparrow extends Bird{
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chu Chu");
    }
}

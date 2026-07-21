package SOLID.V1;

public class Crow extends Bird{
    @Override
    public void fly() {
        System.out.println("Crow am flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Cow Cow");
    }
}
//Now this have only one reason to change(Crow).Each class has its own single responsibility
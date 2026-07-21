package SOLID.V0;

public class Client {
    public static void main(String[] args) {
        Bird b1=new Bird();
        b1.setAge(30);
        b1.setName("b1");
        b1.setType("Peacock");

        b1.eat();
        b1.makeSound();

        Bird b2=new Bird();
        b2.setAge(30);
        b2.setName("b2");
        b2.setType("Crow");
    }
}

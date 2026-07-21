package SOLID.V6;

public interface FlyingDance {
    void fly();
    void dance();
}
//We keep two methods in same interface as we showing those who can fly can dance
//But later we see some can dance but cant fly and vice versa
//but we are enforcing both methods to all birds whether they can do or not
package SOLID.V5;

import SOLID.V4.Flyable;

public class Client {
    public static void main(String[] args) {
    //    Bird p=new Peacock();
        Peacock p1 = new Peacock();
        Flyable p2 = new Peacock();

        FlyingBehavior fb=new LowFlying();
        Sparrow sp=new Sparrow(fb);
    }
}

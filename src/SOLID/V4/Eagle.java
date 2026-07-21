package SOLID.V4;

public class Eagle extends Bird implements Flyable{
    private HighFlying highFlying;

    Eagle(){
        highFlying = new HighFlying();
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle Making Sound");
    }

    @Override
    public void fly() {
        highFlying.flyHigh();
    }
}
//We have hardcoded dependency.If later sparrow fly from low to high then we need to changes a lot in code
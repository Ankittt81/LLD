package DesignPatterns.Decorator;

public class HouseBlend implements Beverage {

    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public void getDescription() {
        System.out.println("Produced HouseBlend");
    }
}

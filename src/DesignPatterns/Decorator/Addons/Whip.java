package DesignPatterns.Decorator.Addons;

import DesignPatterns.Decorator.Beverage;

public class Whip implements Beverage {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 4+beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Whip");
    }
}

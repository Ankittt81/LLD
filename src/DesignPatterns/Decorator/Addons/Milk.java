package DesignPatterns.Decorator.Addons;

import DesignPatterns.Decorator.Beverage;

public class Milk implements Addon {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        if(beverage==null){
            throw new IllegalArgumentException("Please first select the base beverage");
        }
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 12+beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Milk");
    }
}

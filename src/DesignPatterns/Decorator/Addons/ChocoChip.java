package DesignPatterns.Decorator.Addons;

import DesignPatterns.Decorator.Beverage;

public class ChocoChip implements Addon {
    private Beverage beverage;
    public ChocoChip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 8+beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Choco Chip");
    }
}

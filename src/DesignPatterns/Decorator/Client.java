package DesignPatterns.Decorator;

import DesignPatterns.Decorator.Addons.ChocoChip;
import DesignPatterns.Decorator.Addons.Milk;
import DesignPatterns.Decorator.Addons.Whip;

public class Client {
    public static void main(String[] args) {
        Beverage b1=new HouseBlend();
        Beverage b2=new Decaf();

        b1.getDescription();
        System.out.println("Cost of the beverage: "+b1.getCost());

        b2.getDescription();
        System.out.println("Cost of the beverage: "+b2.getCost());

        //HouseBlen with Milk and ChocoChip
        b1=new Milk(b1);
        b1=new ChocoChip(b1);
        b1.getDescription();
        System.out.println("Cost of the beverage :" + b1.getCost());

        //Double Whip Decaf
        b2=new Whip(new Whip(b2));
        b2.getDescription();
        System.out.println("Cost of the beverage: "+b2.getCost());
    }
}

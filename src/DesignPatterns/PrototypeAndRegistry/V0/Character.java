package DesignPatterns.PrototypeAndRegistry.V0;

public class Character {
    private int id;
    private String name;
    private int power;
    private String icon;

    public  Character(int id, String name, int power, String icon){
        this.id = id;
        this.name = name;
        this.power = power;
        this.icon = icon;
    }
    public Character(Character character){
        this.id = character.id;
        this.name = character.name;
        this.power = character.power;
        this.icon = character.icon;
        System.out.println("Character constructor");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}

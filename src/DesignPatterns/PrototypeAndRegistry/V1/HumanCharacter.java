package DesignPatterns.PrototypeAndRegistry.V1;

public class HumanCharacter extends Character {
    private int age;
    public HumanCharacter(int id, String name, int power, String icon) {
        super(id, name, power, icon);
    }

    public HumanCharacter(HumanCharacter character) {
        super(character);
        this.age = character.age;

    }

    @Override
    public HumanCharacter copy() {
        System.out.println("HumanCharacter copy");
        return new HumanCharacter(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

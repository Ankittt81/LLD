package DesignPatterns.PrototypeAndRegistry.V2_Registry;

public class ZombieCharacter extends Character {
    private int level;
    public ZombieCharacter(int id, String name, int power, String icon, int level) {
        super(id, name, power, icon);
        this.level = level;
    }

    public ZombieCharacter(ZombieCharacter character) {
        super(character);
        this.level = character.level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

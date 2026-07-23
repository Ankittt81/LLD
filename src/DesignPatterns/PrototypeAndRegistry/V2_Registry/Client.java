package DesignPatterns.PrototypeAndRegistry.V2_Registry;


public class Client {
    public static void someMethod(Character character) {
//        Character character1=new Character(character);
//
//        if(character instanceof HumanCharacter){
//            character1=new HumanCharacter((HumanCharacter)character);
//        }
//        else if(character instanceof ZombieCharacter){
//            character1=new ZombieCharacter((ZombieCharacter)character);
//        }

        character.copy();

    }
    public static void main(String[] args) {
        Character character = new Character(1, "XYZ", 200, "some");
        HumanCharacter humanCharacter = new HumanCharacter(2, "human", 500, "hum");
        CharacterRegistry characterRegistry = new CharacterRegistry();
        characterRegistry.register("char", character);
        characterRegistry.register("human", humanCharacter);

        someMethod(characterRegistry.get("char"));
        someMethod(characterRegistry.get("human"));
    }
}

package DesignPatterns.PrototypeAndRegistry.V2_Registry;

import java.util.HashMap;

public class CharacterRegistry {
    private HashMap<String,Character> charctersRegistry;
    public CharacterRegistry() {
        charctersRegistry = new HashMap<>();
    }

    public void register(String key, Character character) {
        //can add validation check
        charctersRegistry.put(key, character);
    }
    public Character get(String key) {
        System.out.println("Getting character copy from registry");
        return charctersRegistry.get(key).copy();
        //Always return copy else gets modify the stored object
    }

    public void remove(String key) {
        charctersRegistry.remove(key);
    }
}

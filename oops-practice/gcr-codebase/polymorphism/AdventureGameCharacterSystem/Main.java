package gcr_codebase.Polymorphism.AdventureGameCharacterSystem;

public class Main {

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Aragorn"),
                new Mage("Gandalf"),
                new Archer("Legolas"),
                new Warrior("Leon"),
                new Mage("Merlin")
        };

        Battle battle = new Battle();
        battle.startBattle(characters);
    }
}
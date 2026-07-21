package gcr_codebase.Polymorphism.AdventureGameCharacterSystem;

class Warrior extends GameCharacter {

    public Warrior(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " attacks with a Sword.");
    }
}
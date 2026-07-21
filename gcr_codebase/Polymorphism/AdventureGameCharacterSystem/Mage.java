package gcr_codebase.Polymorphism.AdventureGameCharacterSystem;

class Mage extends GameCharacter {

    public Mage(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " casts a Fireball.");
    }
}
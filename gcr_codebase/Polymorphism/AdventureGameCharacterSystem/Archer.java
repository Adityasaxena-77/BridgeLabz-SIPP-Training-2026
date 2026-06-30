package gcr_codebase.Polymorphism.AdventureGameCharacterSystem;

class Archer extends GameCharacter {

    public Archer(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " shoots an Arrow.");
    }
}
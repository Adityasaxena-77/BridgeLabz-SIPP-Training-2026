package gcr_codebase.Polymorphism.AdventureGameCharacterSystem;

class GameCharacter {
    String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println(characterName + " attacks.");
    }
}
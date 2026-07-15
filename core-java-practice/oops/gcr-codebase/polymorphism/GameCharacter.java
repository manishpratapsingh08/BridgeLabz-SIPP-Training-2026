class GameCharacter {

    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println("Character attacks");
    }
}

class Warrior extends GameCharacter {

    Warrior(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Sword");
    }
}

class Mage extends GameCharacter {

    Mage(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Magic");
    }
}

class Archer extends GameCharacter {

    Archer(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Bow");
    }
}
 
class Main {

    static void startBattle(GameCharacter[] characters) {
        for (GameCharacter c : characters) {
            c.performAttack();
        }
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin")
        };

        startBattle(characters);
    }
}

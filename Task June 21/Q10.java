class Character {
    void attack() {
        System.out.println("Character attacks!");
    }
}

class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior swings sword!");
    }
}

class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage casts fireball!");
    }
}

public class Q10 {
    public static void main(String[] args) {
        Character[] chars = {
            new Warrior(),
            new Mage()
        };
        for (Character c : chars) {
            c.attack();
        }
    }
}

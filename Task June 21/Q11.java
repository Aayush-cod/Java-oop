abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() { 
        System.out.println("Piano goes plink-plonk"); 
    }
}

class Guitar extends Instrument {
    void playSound() { 
        System.out.println("Guitar goes strum-strum"); 
    }
}

class Violin extends Instrument {
    void playSound() { 
        System.out.println("Violin goes scree-scree"); 
    }
}

public class Q11 {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Piano(),
            new Guitar(),
            new Violin()
        };
        for (Instrument i : instruments) {
            i.playSound();
        }
    }
}

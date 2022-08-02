interface DogInterface {
    void bark();
    void poop();
}

abstract class Dog {
    public void bark() {
        System.out.println("Bark!");
    }

    public abstract void poop();
}

class Chihuahua extends Dog {
    public void poop() {
        System.out.println("Chihuahua pooped!");
    }
}

class GoldenRetriever implements DogInterface {
    public void bark() {
        System.out.println("Golden Bark!");
    }

    public void poop() {
        System.out.println("Golden Pooped!");
    }
}

public class Abstraction {
    public static void main(String [] args) {
        Chihuahua chi = new Chihuahua();
        chi.bark();
        chi.poop();

        GoldenRetriever g = new GoldenRetriever();
        g.bark();
        g.poop();
    }
}

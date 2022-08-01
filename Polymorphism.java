class Bird {
    public void sing() {
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends Bird {
    public void sing() {
        System.out.println("twiddledeedee");
    }
}

class Pelican extends Bird {
    public void sing() {
        System.out.println("kwaah kwaah kwaah");
    }
}

public class Polymorphism {
    public static void main(String [] args) {
        Robin r = new Robin();
        r.sing();

        Pelican p = new Pelican();
        p.sing();
    }
}

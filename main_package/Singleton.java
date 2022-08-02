package main_package;

public class Singleton {
    public static void main (String [] args) {
        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance(); // same instance of object
    }
}

class Abc {
    private static Abc obj = new Abc();

    private Abc () {

    }

    public static Abc getInstance() {
        return obj;
    }
}

package main_package;


public class EnumTypes {
    enum Flavor {
        CHOCOLATE, VANILLA, STRAWBERRY;
        public static void getVanilla() {
            System.out.println(Flavor.VANILLA);
        }
    }

    public static void main(String [] args) {
        Flavor flav = Flavor.CHOCOLATE;

        if(flav == Flavor.CHOCOLATE) {
            System.out.println("it's chocolate");
        } else if (flav == Flavor.VANILLA) {
            System.out.println("it's vanilla");
        } else if (flav == Flavor.STRAWBERRY) {
            System.out.println("it's strawberry");
        }

        Flavor.getVanilla();
    }
}

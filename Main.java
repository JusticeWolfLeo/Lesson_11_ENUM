public class Main {
    public static void main(String[] args) {
        sea();
        air();
    }
    public static void sea() {
        SeaNavigation[] seaNavigation = SeaNavigation.values();

        for (SeaNavigation i : SeaNavigation.values()) {
            System.out.println("По команде " + i.name() + " " + i.getS());
        }
    }
    public static void air() {
        AirNavigation[] airNavigation = AirNavigation.values();

        for (AirNavigation i : AirNavigation.values()) {
            System.out.println(i.getInfo()  + i.getPeleng());
        }
    }
}
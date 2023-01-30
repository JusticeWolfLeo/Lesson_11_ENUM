public class Main {
    public static void main(String[] args) {
        Submarine submarine = new Submarine();

        switch (submarine.getSeaNavigation) {
            case NORTH:
                System.out.println(SeaNavigation.NORTH);
                break;
            case SOUTH:
                System.out.println(SeaNavigation.SOUTH);
                break;
            case WEST:
                System.out.println(SeaNavigation.WEST);
                break;
            case EAST:
                System.out.println(SeaNavigation.EAST);
                break;
        }
    }
}
public enum SeaNavigation {
    NORTH("Поворачиваем на север"),

    SOUTH("Поворачиваем на юг"),

    WEST("Поворачиваем на запад"),

    EAST("Поворачиваем на восток");

    private String s;


    SeaNavigation(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}



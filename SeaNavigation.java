public enum SeaNavigation {
    NORTH("Поворачиваем на север"),

    SOUTH("Поворачиваем на юг"),

    WEST("Поворачиваем на запад"),

    EAST("Поворачиваем на восток");

    private String s;

    private int i;

    SeaNavigation(String s) {
    }

    public String getS() {
        return s;
    }

    public int getI() {
        return i;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setI(int i) {
        this.i = i;
    }
}



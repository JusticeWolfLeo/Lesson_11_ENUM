public enum AirNavigation {
    HEIGHT("Высота ", 5000),
    SPEED("Идем на сверхзвуке! Скорость ", 850);

private String info;
private int peleng;

    AirNavigation(String info, int peleng) {
        this.info = info;
        this.peleng = peleng;
    }

    public String getInfo() {
        return info;
    }

    public int getPeleng() {
        return peleng;
    }
}


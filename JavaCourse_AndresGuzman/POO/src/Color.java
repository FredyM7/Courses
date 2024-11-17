public enum Color {

    ROJO("Rojito"),
    AMARILLO("Amarillito"),
    AZUL("Azulito"),
    BLANCO("Blanquito"),
    GRIS("Grisito"),
    NARANJA("Naranjita");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() { return color; }

    @Override
    public String toString() {
        return this.color;
    }
}

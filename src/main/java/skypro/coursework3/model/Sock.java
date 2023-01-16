package skypro.coursework3.model;

import java.util.Objects;

public class Sock {

    private final Color color;
    private final Size size;
    private final int cottonPercentage;

    public Sock(Color color, Size size, int cottonPercentage) {
        this.color = color;
        this.size = size;
        this.cottonPercentage = cottonPercentage;
    }

    public Color getColor() {
        return color;
    }
    public Size getSize() {
        return size;
    }
    public int getCottonPercentage() {
        return cottonPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sock socks = (Sock) o;
        return cottonPercentage == socks.cottonPercentage && color == socks.color && size == socks.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size, cottonPercentage);
    }
}
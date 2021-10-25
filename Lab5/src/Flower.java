import java.util.Arrays;
import java.util.Objects;

public class Flower {
    private final double sepalLength;
    private final int[] color;
    private final double price;
    protected String name;


    Flower(int[] col, double sL, double pr){
        this.color = col.clone();
        this.price = pr;
        this.sepalLength = sL;
    }

    public double getPrice() {
        return price;
    }

    public int[] getColor() {
        return color;
    }

    public double getSepalLength() {
        return sepalLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.getSepalLength(), getSepalLength()) == 0 && Double.compare(flower.getPrice(), getPrice()) == 0 && Arrays.equals(getColor(), flower.getColor()) && Objects.equals(name, flower.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSepalLength(), getPrice(), name);
        result = 31 * result + Arrays.hashCode(getColor());
        return result;
    }
}

package pe.edu.utp.model;

import java.util.Comparator;
import java.util.Objects;

public class Laptop implements Comparable<Laptop> {
    public static final Comparator<Laptop> LAPTOP_COMPARATOR_NATURAL_ORDER = Comparator.comparing(Laptop::getBrand).thenComparing(Laptop::getModel);
    private final String brand;
    private final String model;


    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(brand, laptop.brand) && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Laptop o) {
        return LAPTOP_COMPARATOR_NATURAL_ORDER.compare(this, o);
    }
}

package bikes.abstractbikes;

import java.util.Objects;

public abstract class Bike {

    private final String brand;

    private final String lightAvailability;

    private final String color;

    private final String weight;

    private final String price;



    protected Bike(String brand, String lightAvailability, String color, String weight, String price) {
        this.brand = brand;
        this.lightAvailability = lightAvailability;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public String getLightAvailabilityForInfo() {
        return this.lightAvailability.equals("true") ? " head/tail " : " no head/tail ";
    }

    public String getLightAvailability() {
        return lightAvailability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return brand.equals(bike.brand) &&
                lightAvailability.equals(bike.lightAvailability) &&
                color.equals(bike.color) &&
                weight.equals(bike.weight) &&
                price.equals(bike.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, lightAvailability, color, weight, price);
    }
}

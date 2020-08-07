package bikes;

import bikes.abstractbikes.Bike;

import java.util.Objects;

public class FoldingBike extends Bike {

    public static final String BIKE_TYPE = "FOLDING BIKE";

    private final String info;

    private final String wheelsSize;

    private final String numberOfGears;

    public FoldingBike(String brand, String wheelsSize, String numberOfGears, String weight,
                       String lightAvailability, String color, String price) {
        super(brand, lightAvailability, color, weight, price);
        this.wheelsSize = wheelsSize;
        this.numberOfGears = numberOfGears;
        this.info = BIKE_TYPE + " " + brand +" with" + numberOfGears + " gear(s) and" +
                this.getLightAvailabilityForInfo() + "light." + "\nPrice:" + price + " euros.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FoldingBike that = (FoldingBike) o;
        return info.equals(that.info) &&
                wheelsSize.equals(that.wheelsSize) &&
                numberOfGears.equals(that.numberOfGears);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), info, wheelsSize, numberOfGears);
    }

    public String getInfo() {
        return info;
    }

}

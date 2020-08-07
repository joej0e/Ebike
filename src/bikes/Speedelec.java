package bikes;

import bikes.abstractbikes.ElectricBike;

import java.util.Objects;

public class Speedelec extends ElectricBike {

    public static final String BIKE_TYPE = "SPEEDELEC";

    private final String info;

    public Speedelec(String brand, String maxSpeed, String weight,
                     String lightAvailability, String batteryCapacity, String color, String price) {
        super(brand, maxSpeed, weight, lightAvailability, batteryCapacity, color, price);
        this.info = BIKE_TYPE + " " + brand + " with" + batteryCapacity + " mAh battery and" +
                this.getLightAvailabilityForInfo() + "light." + "\nPrice:" + price + " euros.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speedelec speedelec = (Speedelec) o;
        return info.equals(speedelec.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), info);
    }
}

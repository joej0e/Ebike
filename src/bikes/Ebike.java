package bikes;

import bikes.abstractbikes.ElectricBike;

import java.util.Objects;

public class Ebike extends ElectricBike {

    public static final String BIKE_TYPE = "E-BIKE";

    private final String info;



    public Ebike(String brand, String maxSpeed, String weight, String lightAvailability,
                 String batteryCapacity, String color, String price) {
        super(brand, maxSpeed, weight, lightAvailability, batteryCapacity, color, price);
        this.info = BIKE_TYPE + " " + brand + " with " + batteryCapacity + "mAh battery and" +
                this.getLightAvailabilityForInfo() + "light." + "\nPrice: " + price + " euros.";
    }

    public String getInfo() {
        return info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ebike ebike = (Ebike) o;
        return info.equals(ebike.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), info);
    }
}

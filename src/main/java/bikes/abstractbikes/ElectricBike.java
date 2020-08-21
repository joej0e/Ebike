package bikes.abstractbikes;

import java.util.Objects;

public abstract class ElectricBike extends Bike {

    private final String maxSpeed;

    private final String batteryCapacity;

    protected ElectricBike(String brand, String maxSpeed, String weight,
                           String lightAvailability, String batteryCapacity, String color, String price) {
        super(brand, lightAvailability, color, weight, price);
        this.maxSpeed = maxSpeed;
        this.batteryCapacity = batteryCapacity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricBike that = (ElectricBike) o;
        return maxSpeed.equals(that.maxSpeed) &&
                batteryCapacity.equals(that.batteryCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed, batteryCapacity);
    }
}

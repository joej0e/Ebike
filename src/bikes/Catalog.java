package bikes;

import bikes.abstractbikes.Bike;

import java.util.List;
import java.util.Map;

public class Catalog {

    private final Map<String, List<Ebike>> ebikemap;

    private final Map<String, List<FoldingBike>> foldingBikeMap;

    private final Map<String, List<Speedelec>> speedelecMap;

    public Catalog(Map<String, List<Ebike>> ebikeMap, Map<String,
            List<FoldingBike>> foldingBikeMap, Map<String, List<Speedelec>> speedelecMap) {
        this.ebikemap = ebikeMap;
        this.foldingBikeMap = foldingBikeMap;
        this.speedelecMap = speedelecMap;
    }

    /*
    public <T extends Bike> T search(String brand, String maxSpeed,  String weight,
                                     String lightAvailability, String batteryCapacity, String color, String price) {

    }

    public <T extends Bike> T search(String brand, String maxSpeed,  String weight,
                                     String lightAvailability, String batteryCapacity, String color) {

    }

    public <T extends Bike> T search(String brand, String maxSpeed,  String weight,
                                     String lightAvailability, String batteryCapacity) {

    }

    public <T extends Bike> T search(String brand, String maxSpeed,  String weight,
                                     String lightAvailability) {

    }

    public <T extends Bike> T search(String brand, String maxSpeed,  String weight) {

    }

    public <T extends Bike> T search(String brand, String maxSpeed) {

    }

    public <T extends Bike> T search(String brand) {

    }


     */

}

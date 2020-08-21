package bikes;

public enum BikeTypes {

    FOLDING_BIKE("FOLDING BIKE"),
    SPEEDELEC("SPEEDELEC"),
    EBIKE("E-BIKE");

    BikeTypes(String bikeType) {
    }

    private static String getLightAvailabilityForInfo(String light) {
        return light.equals("true") ? " head/tail " : " no head/tail ";
    }


    public static String getSpecifications(String[] splitSpecifications, String bikeTypeAndBrand) {
        if(bikeTypeAndBrand.contains("FOLDING BIKE")) {
            return bikeTypeAndBrand + " with" + splitSpecifications[1] + " gear(s) and" +
                    getLightAvailabilityForInfo(splitSpecifications[3]) + "light." + "\nPrice:" +
                    splitSpecifications[6] + " euros.";
        }
        return bikeTypeAndBrand + splitSpecifications[0] + " with" + splitSpecifications[4] + " mAh battery and" +
                getLightAvailabilityForInfo(splitSpecifications[3]) + "light." + "\nPrice: " +
                splitSpecifications[6] + "euros.";
    }
}

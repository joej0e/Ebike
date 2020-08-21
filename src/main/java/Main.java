import bikes.BikeTypes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        final String fileName = "C:\\Users\\User\\IdeaProjects\\Ebike\\src\\test\\resources\\file.txt";
        List<String> strings = Files.readAllLines(Paths.get(fileName));
        Set<String> bikeTypeAndBrands = new HashSet<>();
        Map<String, List<String>> bikes = new HashMap<>();

        for (int i = strings.size() - 1; i > -1; i--) {
            String bikeTypeAndBrand = strings.get(i).substring(0, strings.get(i).indexOf(";"));
            bikeTypeAndBrands.add(bikeTypeAndBrand);
        }

        for (String bikeTypeAndBrand : bikeTypeAndBrands) {
            bikes.put(bikeTypeAndBrand, new ArrayList<>());
        }

        for (int i = strings.size() - 1; i > -1; i--) {
            String bikeTypeAndBrand = strings.get(i).substring(0, strings.get(i).indexOf(";"));
            String[] splitSpecifications = strings.get(i).substring(strings.get(i).indexOf(";")).split(";");
            bikes.get(bikeTypeAndBrand).add(BikeTypes.getSpecifications(splitSpecifications, bikeTypeAndBrand));
        }


        //TODO
        /*

        List<Ebike> ebikes = new ArrayList<>();

        List<FoldingBike> foldingBikes = new ArrayList<>();

        List<Speedelec> speedelecs = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach((s) -> {
                String[] splittedLine = s.split("; ");
                if(s.charAt(0) == 'E') {
                    ebikes.add(BikeFabric.getBike(splittedLine));
                }
                if(s.charAt(0) == 'F') {
                    foldingBikes.add(BikeFabric.getBike(splittedLine));
                }
                if(s.charAt(0) == 'S') {
                    speedelecs.add(BikeFabric.getBike(splittedLine));
                }
            });
        }

        Map<String, List<Ebike>> ebikesListOfLists = new HashMap<>();

        int counter = 0;

        for(int i = ebikes.size()-1; i > -1; i--) {
            counter = 0;
            Ebike lastElement = ebikes.get(i);
            ebikes.remove(i);
            String brand = lastElement.getBrand();
            List<Ebike> certainBrandEbikes = new ArrayList<>();
            certainBrandEbikes.add(lastElement);
            for (int j = i-1; j > -1; j--) {
                Ebike currentElement = ebikes.get(j);
                if(currentElement.getBrand().equals(brand)) {
                    counter++;
                    certainBrandEbikes.add(currentElement);
                    ebikes.remove(j);
                }
            }
            i = i - counter;
            ebikesListOfLists.put(brand, certainBrandEbikes);
        }

        for(int i = 0; i < ebikesListOfLists.size()-1; i++) {
            for(int j = 0; j < ebikesListOfLists.get("Ferrari").size()-1; j++) {
                System.out.println(ebikesListOfLists.get("Ferrari").get(j).getInfo());
                System.out.println(ebikesListOfLists.get("Ferrari").get(j).getLightAvailability());
            }
        }

         */

    }

}

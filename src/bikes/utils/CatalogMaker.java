package bikes.utils;

import bikes.Catalog;
import bikes.Ebike;
import bikes.FoldingBike;
import bikes.Speedelec;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogMaker {

    public static Catalog getCatalog(String fileName) throws IOException {
            List<String> strings = Files.readAllLines(Paths.get(fileName));
            Map<String, List<Ebike>> ebikesMap = new HashMap<>();
            Map<String, List<FoldingBike>> foldingBikesMap = new HashMap<>();
            Map<String, List<Speedelec>> speedelecsMap = new HashMap<>();
            int counter;
            for(int i = strings.size()-1; i > -1; i--) {
                counter = 0;
                String[] lastString = strings.get(i).split("; ");
                String[] bikeTypeAndBrand = lastString[0].split(" ");
                String brand = bikeTypeAndBrand[bikeTypeAndBrand.length-1];
                List<Ebike> ebikesList = new ArrayList<>();
                List<FoldingBike> foldingBikesList = new ArrayList<>();
                List<Speedelec> speedelecsList = new ArrayList<>();
                switch (bikeTypeAndBrand[0].charAt(0)) {
                    case 'E':
                        ebikesList.add(new Ebike(brand, lastString[1], lastString[2], lastString[2],
                                lastString[4], lastString[5], lastString[6]));
                        counter = getCounter(strings, counter, i, brand, ebikesList);
                        i = i - counter;
                    ebikesMap.put(brand, ebikesList);

                    case 'F':
                        foldingBikesList.add(new FoldingBike(brand, lastString[1], lastString[2], lastString[2],
                                lastString[4], lastString[5], lastString[6]));
                        counter = getCounter(strings, counter, i, brand, ebikesList);
                        i = i - counter;
                        foldingBikesMap.put(brand, foldingBikesList);

                    case 'S':
                        speedelecsList.add(new Speedelec(brand, lastString[1], lastString[2], lastString[2],
                                lastString[4], lastString[5], lastString[6]));
                        counter = getCounter(strings, counter, i, brand, ebikesList);
                        i = i - counter;
                        speedelecsMap.put(brand, speedelecsList);
                }
            }
            return new Catalog(ebikesMap, foldingBikesMap, speedelecsMap);
    }

    private static int getCounter(List<String> strings, int counter, int i, String brand, List<Ebike> ebikesList) {
        for (int j = i-1; j > -1; j--) {
            String[] currentString = strings.get(j).split("; ");
            String[] currentBikeTypeAndBrand = currentString[0].split(" ");
            String currentBrand = currentBikeTypeAndBrand[currentBikeTypeAndBrand.length-1];
            if(currentBikeTypeAndBrand[0].charAt(0) == ('E') && currentBrand.equals(brand)) {
                counter++;
                ebikesList.add(new Ebike(brand, currentString[1], currentString[2], currentString[2],
                        currentString[4], currentString[5], currentString[6]));
                strings.remove(j);
            }
        }
        return counter;
    }

}

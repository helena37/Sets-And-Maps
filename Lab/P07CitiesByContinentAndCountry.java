package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int lines = Integer.parseInt(reader.readLine());
        Map<String, Map<String, List<String>>> continentsData = new LinkedHashMap<>();

        for (int i = 1; i <= lines; i++) {
            String[] data = reader.readLine().split("\\s+");

            String continent = data[0];
            String country = data[1];
            String town = data[2];

            if (!continentsData.containsKey(continent)) {
                continentsData.put(continent, new LinkedHashMap<>());
                continentsData.get(continent).put(country, new ArrayList<>());
                continentsData.get(continent).get(country).add(town);
            } else {
                if (continentsData.containsKey(continent) &&
                        continentsData.get(continent).containsKey(country)) {
                    continentsData.get(continent).get(country).add(town);
                } else if (continentsData.containsKey(continent) &&
                        !continentsData.get(continent).containsKey(country)) {
                    continentsData.get(continent).put(country, new ArrayList<>());
                    continentsData.get(continent).get(country).add(town);
                }
            }
        }

        for (Map.Entry<String, Map<String, List<String>>> entry : continentsData.entrySet()) {
            System.out.println(entry.getKey() + ":");

            Map<String, List<String>> countriesAndTowns = entry.getValue();

            for (Map.Entry<String, List<String>> country : countriesAndTowns.entrySet()) {
                System.out.print(String.format("%s -> ", country.getKey()));

                List<String> towns = country.getValue();

                int counter = towns.size();
                for (String town : towns) {
                    if (counter > 1) {
                        System.out.print(town + ", ");
                    } else {
                        System.out.print(town);
                    }
                    counter--;
                }
                System.out.println();
            }
        }
    }
}

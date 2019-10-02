package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class EP10PopulationCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input;
        Map<String, Map<String, Long>> countriesInfo = new LinkedHashMap<>();

        while (!"report".equals(input = reader.readLine())) {

            String[] data = input.split("\\|");

            String town = data[0];
            String country = data[1];
            long population = Long.parseLong(data[2]);

            if (!countriesInfo.containsKey(country)) {
                countriesInfo.put(country, new LinkedHashMap<>());
                countriesInfo.get(country).put(town, population);
            } else {
                countriesInfo.get(country).put(town, population);
            }
        }

        Map<String, Long> populationCount = new LinkedHashMap<>();

        countriesInfo
                .forEach((country, town) -> town.forEach((t, p) -> {
                    if (populationCount.containsKey(country)) {
                        populationCount.put(country, populationCount.get(country) + p);
                    } else {
                        populationCount.put(country, p);
                    }
                }));

       populationCount
               .entrySet()
               .stream()
               .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
               .forEach(country -> {
                   System.out.println(String.format("%s (total population: %d)",
                           country.getKey(), country.getValue()));

                   if (countriesInfo.containsKey(country.getKey())) {

                       countriesInfo.get(country.getKey())
                               .entrySet()
                               .stream()
                               .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                               .forEach(x -> System.out.println(String.format("=>%s: %d",
                                       x.getKey(),
                                       x.getValue())));
                   }
               });

       //  Още един начин за сортиране (даже по - добър от моя ;))
       // countriesInfo.entrySet().stream()
       //         .sorted((c1,c2)-> populationCount.get(c2.getKey()).compareTo(populationCount.get(c1.getKey())))
       //         .forEach(country ->{
       //             System.out.format("%s (total population: %d)\n",
       //                     country.getKey(),
       //                     populationCount.get(country.getKey()));
       //             country.getValue().entrySet()
       //                     .stream().sorted((t1,t2)-> t2.getValue().compareTo(t1.getValue()))
       //                     .forEach(city ->
       //                             System.out.format("=>%s: %d\n",
       //                                     city.getKey(),
       //                                     city.getValue()));
       //         });
    }
}

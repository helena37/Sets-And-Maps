package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class P04CountRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        double[] numbers = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        HashMap<Double, Integer> myMap = new LinkedHashMap<>();

        for (double number : numbers) {

            if (!myMap.containsKey(number)) {
                myMap.put(number, 1);
            } else {
                myMap.put(number, myMap.get(number) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : myMap.entrySet()) {

            System.out.println(String.format("%.1f -> %d", entry.getKey(), entry.getValue()));
        }
    }
}

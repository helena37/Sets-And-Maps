package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class EP04CountSymbols {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String text = reader.readLine();

        Map<Character, Integer> symbolsCounter = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {

            char currentSymbol = text.charAt(i);

            if (!symbolsCounter.containsKey(currentSymbol)) {
                symbolsCounter.put(currentSymbol, 1);
            } else {
                symbolsCounter.put(currentSymbol, symbolsCounter.get(currentSymbol) + 1);
            }
        }

        symbolsCounter.forEach((symbol, count) -> {
            System.out.println(String.format(
                    "%c: %d time/s",
                    symbol, count
            ));
        });
    }
}

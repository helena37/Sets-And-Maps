package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class EP03PeriodicTable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int lines = Integer.parseInt(reader.readLine());

        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < lines; i++) {
            String[] input = reader.readLine().split("\\s+");
            Collections.addAll(elements, input);
        }

       elements.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}

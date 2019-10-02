package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class EP02SetsOfElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] lines = reader.readLine().split("\\s+");

        int firstSetLines = Integer.parseInt(lines[0]);
        int secondSetLines = Integer.parseInt(lines[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLines; i++) {
            int num = Integer.parseInt(reader.readLine());

            firstSet.add(num);
        }

        for (int i = 0; i < secondSetLines; i++) {
            int num = Integer.parseInt(reader.readLine());

            secondSet.add(num);
        }

        for (Integer first : firstSet) {

            if (secondSet.contains(first)) {
                System.out.print(first + " ");
            }
        }
    }
}

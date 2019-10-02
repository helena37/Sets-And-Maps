package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class EP01UniqueUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int lines = Integer.parseInt(reader.readLine());
        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < lines; i++) {
            String name = reader.readLine();

            names.add(name);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}

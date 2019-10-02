package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class P02SoftUniParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        HashSet<String> allGuests = new HashSet<>();
        HashSet<String> partyGuests = new HashSet<>();

        String input;

        while (!"PARTY".equals(input = reader.readLine())) {
            allGuests.add(input);
        }

        while (!"END".equals(input = reader.readLine())) {
            partyGuests.add(input);
        }

        TreeSet<String> missingGuests = new TreeSet<>();

        for (String guest : allGuests) {

            if (!partyGuests.contains(guest)) {
                missingGuests.add(guest);
            }
        }

        System.out.println(missingGuests.size());
        missingGuests.forEach(e -> System.out.println(e));
    }
}

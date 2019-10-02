package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EP05Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String contactDetails = "";
        Map<String, String> phoneBook = new HashMap<>();

        while (!"search".equals(contactDetails = reader.readLine())) {

            String regex = "\\b(?<name>[A-Za-z]+[\\(A-Za-z\\)]*)-(?<number>\\+*[\\d]+[\\/]*[\\d]*)\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(contactDetails);

            if (matcher.find()) {
                String name = matcher.group("name");
                String phoneNumber = matcher.group("number");

                phoneBook.put(name,phoneNumber);
            }
        }

        while (!"stop".equals(contactDetails = reader.readLine())) {

            if (phoneBook.containsKey(contactDetails)) {
                System.out.println(contactDetails + " -> " + phoneBook.get(contactDetails));
            } else {
                System.out.println(String.format("Contact %s does not exist.", contactDetails));
            }
        }
    }
}

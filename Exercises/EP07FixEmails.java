package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class EP07FixEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String name = "";
        Map<String, String> namesAndEmails = new LinkedHashMap<>();

        while (!"stop".equals(name = reader.readLine())) {
            String email = reader.readLine();

            String subString = email.substring(email.indexOf("."));

            if (!subString.equals(".us") && !subString.equals(".uk") && !subString.equals(".com")) {
                namesAndEmails.putIfAbsent(name, email);
            }
        }
            namesAndEmails.forEach((n, e) -> {
                System.out.println(String.format("%s -> %s",
                        n, e));
            });
    }
}

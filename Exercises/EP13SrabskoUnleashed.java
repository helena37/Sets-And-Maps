package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EP13SrabskoUnleashed {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = "";
        Map<String, Map<String, Integer>> venueData = new LinkedHashMap<>();

        while (!"End".equals(input = reader.readLine())) {
            String regex = "^(?<singer>[A-Z]+[a-z]+\\s*[A-Z]*[a-z]*\\s*[A-Z]*[a-z]*)\\s@" +
                    "(?<venue>[A-Z]+[a-z]+\\s*[A-Z]*[a-z]*\\s*[A-Z]*[a-z]*)\\s" +
                    "(?<ticketPrice>\\d+)\\s(?<ticketsCount>\\d+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String venue = matcher.group("venue");
                String singer = matcher.group("singer");
                int ticketPrice = Integer.parseInt(matcher.group("ticketPrice"));
                int ticketsCount = Integer.parseInt(matcher.group("ticketsCount"));

                if (!venueData.containsKey(venue)) {
                    venueData.put(venue, new LinkedHashMap<>());
                    venueData.get(venue).put(singer, ticketPrice * ticketsCount);
                } else {
                    if (venueData.get(venue).containsKey(singer)) {
                        venueData.get(venue).put(singer,
                                venueData.get(venue).get(singer)
                                        + (ticketPrice * ticketsCount));
                    } else {
                        venueData.get(venue).put(singer, ticketPrice * ticketsCount);
                    }
                }
            }
        }

        venueData
                .entrySet()
                .forEach(e -> {
                    System.out.println(e.getKey());
                    Map<String, Integer> result = e.getValue();

                    result
                            .entrySet()
                            .stream()
                            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                            .forEach(x ->
                                    System.out.println(
                                            String.format("#  %s -> %d",
                                                    x.getKey(), x.getValue())));
                });
    }
}
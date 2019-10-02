package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class EP11LogsAggregator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int lines = Integer.parseInt(reader.readLine());

        Map<String, Map<String, Integer>> usersData = new TreeMap<>();

        for (int i = 0; i < lines; i++) {

            String[] data = reader.readLine().split("\\s+");

            String ip = data[0];
            String user = data[1];
            int duration = Integer.parseInt(data[2]);

            if (!usersData.containsKey(user)) {
                usersData.put(user, new TreeMap<>());
                usersData.get(user).put(ip, duration);
            } else {
                if (usersData.get(user).containsKey(ip)) {
                    usersData.get(user).put(ip, usersData.get(user).get(ip) + duration);
                } else {
                    usersData.get(user).put(ip, duration);
                }
            }
        }

        for (Map.Entry<String, Map<String, Integer>> entry : usersData.entrySet()) {
            System.out.print(entry.getKey() + ":" + " ");
            Map<String, Integer> durations = entry.getValue();

            int d = 0;
            for (Map.Entry<String, Integer> dur : durations.entrySet()) {
                d += dur.getValue();
            }

            System.out.print(d + " ");

            int counter = durations.size();

            for (Map.Entry<String, Integer> entry1 : durations.entrySet()) {
                if (counter == durations.size() && durations.size() > 1) {
                    System.out.print("[" + entry1.getKey() + ", ");
                } else if (counter > 1 && counter < durations.size()) {
                    System.out.print(entry1.getKey() + ", ");
                } else if (durations.size() > 1 && counter <= 1){
                    System.out.println(entry1.getKey() + "]");
                } else {
                    System.out.println("[" + entry1.getKey() + "]");
                }
                counter--;
            }
         }
    }
}

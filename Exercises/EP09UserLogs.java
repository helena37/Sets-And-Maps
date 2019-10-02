package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EP09UserLogs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        StringBuilder input = new StringBuilder("");
        Map<String, Map<String, Integer>> usersData = new TreeMap<>();

        while (!"end".contentEquals(input = new StringBuilder(reader.readLine()))) {

            String ip = input.substring(input.indexOf("=") + 1, input.indexOf(" "));
            input.replace(0, input.indexOf("'") + 1, "");

            String user = input.substring(input.indexOf("=") + 1);

            if (!usersData.containsKey(user)) {
                usersData.put(user, new LinkedHashMap<>());
                usersData.get(user).put(ip, 1);
            } else {
                if (!usersData.get(user).containsKey(ip)) {
                    usersData.get(user).put(ip, 1);
                } else {
                    usersData.get(user).put(ip, usersData.get(user).get(ip) + 1);
                }
            }
        }

        usersData.forEach((user, ip) -> {
            System.out.println(user + ":");
            final int[] counter = {ip.size()};
            ip.forEach((i, count) -> {
                if (counter[0] > 1) {
                    System.out.print(String.format("%s => %d, ",
                            i, count));
                } else {
                    System.out.print(String.format("%s => %d.\n",
                            i, count));
                }
                counter[0]--;
            });
        });
    }
}

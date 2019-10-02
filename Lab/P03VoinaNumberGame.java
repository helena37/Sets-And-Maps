package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class P03VoinaNumberGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

       LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>();
               Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(firstPlayer::add);

       LinkedHashSet<Integer> secondPlayer = new LinkedHashSet<>();
               Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(secondPlayer::add);

        for (int round = 0; round < 50; round++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                break;
            }

            Iterator<Integer> firstPlayerIter = firstPlayer.iterator();
            Iterator<Integer> secondPlayerIter = secondPlayer.iterator();

            int firstValue = firstPlayerIter.next();
            firstPlayer.remove(firstValue);
            int secondValue = secondPlayerIter.next();
            secondPlayer.remove(secondValue);

            if (firstValue > secondValue) {
                firstPlayer.add(firstValue);
                firstPlayer.add(secondValue);
            } else if (firstValue < secondValue) {
                secondPlayer.add(firstValue);
                secondPlayer.add(secondValue);
            } else {
                firstPlayer.add(firstValue);
                secondPlayer.add(secondValue);
            }
        }

        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}

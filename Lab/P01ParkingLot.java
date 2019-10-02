package Lab;

import java.util.HashSet;
import java.util.Scanner;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> parkingLot = new HashSet<>();

        String input;

        while (!"END".equals(input = scanner.nextLine())) {
            String[] data = input.split(",\\s+");

            String command = data[0];
            String autoNumber = data[1];

            switch (command) {
                case "IN":
                    parkingLot.add(autoNumber);
                    break;
                case "OUT":
                        parkingLot.remove(autoNumber);
                    break;
            }
        }

       // if (!parkingLot.isEmpty()) {
       //     for (String autoNumber : parkingLot) {
       //         System.out.println(autoNumber);

                //Razlichni nachini za printirane!!!
                // parkingLot.forEach(e -> System.out.println(e));

                // System.out.println(String.join(System.lineSeparator(), parkingLot));
      //      }
      //  } else {
      //      System.out.println("Parking Lot is Empty");
      //  }

        System.out.println(parkingLot.isEmpty() ? "Parking Lot is Empty"
                : String.join(System.lineSeparator(), parkingLot));
    }
}

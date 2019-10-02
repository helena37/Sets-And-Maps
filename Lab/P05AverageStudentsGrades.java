package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class P05AverageStudentsGrades {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int studentsCount = Integer.parseInt(reader.readLine());

        Map<String, List<Double>> studentsInfo = new TreeMap<>();
        Map<String, Double> grades = new TreeMap<>();

        for (int i = 1; i <= studentsCount; i++) {
            String[] studentsData = reader.readLine().split("\\s+");

            String name = studentsData[0];
            double grade = Double.parseDouble(studentsData[1]);

            if (!studentsInfo.containsKey(name)) {
                grades.put(name, grade);
                studentsInfo.put(name, new ArrayList<>());
                studentsInfo.get(name).add(grade);
            } else {
                grades.put(name, grades.get(name) + grade);
                studentsInfo.get(name).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : studentsInfo.entrySet()) {

            List<Double> currentGrade = entry.getValue();
            System.out.print(String.format("%s -> ", entry.getKey()));

            for (Double grade : currentGrade) {

                System.out.print(String.format("%.2f ", grade));
            }

            for (Map.Entry<String, Double> doubleEntry : grades.entrySet()) {

                if (doubleEntry.getKey().equals(entry.getKey())) {

                    System.out.println(String.format("(avg: %.2f)",
                            doubleEntry.getValue() / currentGrade.size()));
                }
            }
        }

        /* Резултатът може да бъде принтиран и със stream API, по следния начин:

studentsInfo.forEach((name, grade) -> {
            String allGrades = grade.stream()
                    .map(g -> String.format("%.2f", g))
                    .collect(Collectors.joining(" "));

            double avg = grade.stream()
                    .mapToDouble(e -> e).average().orElse(0d);
            System.out.println(
                    String.format("%s -> %s (avg: %.2f)",
                            name,
                            allGrades,
                            avg)
            );

        });

            !!!Задачата не излиза на 100%(90%) с този начин на принтиране!!!
         */
    }
}


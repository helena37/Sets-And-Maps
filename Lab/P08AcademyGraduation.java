package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;

public class P08AcademyGraduation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int lines = Integer.parseInt(reader.readLine());

        Map<String, Double[]> studentsInfo = new TreeMap<>();

        for (int i = 0; i < lines; i++) {

            String name = reader.readLine();
            String[] gradesStrings = reader.readLine().split("\\s+");
            Double[] grades = new Double[gradesStrings.length];

            for (int j = 0; j < gradesStrings.length; j++) {
                grades[j] = Double.parseDouble(gradesStrings[j]);
            }
            studentsInfo.put(name, grades);
        }

        for (Map.Entry<String, Double[]> entry : studentsInfo.entrySet()) {
            Double[] grades = entry.getValue();

            double averageGrade = 0;
            for (Double grade : grades) {
                averageGrade += grade;
            }
            averageGrade /= grades.length;

            DecimalFormat df = new DecimalFormat("#.################");

            System.out.println(entry.getKey() + " is graduated with " + df.format(averageGrade));
        }
    }
}

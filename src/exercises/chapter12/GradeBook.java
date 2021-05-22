package exercises.chapter12;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class GradeBook {

    public static void main(String[] args) {

        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

        // Sort the grade-book by student name.
        // My code based on https://www.codespeedy.com/convert-a-hashmap-to-treemap-in-java/
        /* Map<String, Integer> gradeBook = new TreeMap<>(); */
        /* gradeBook.putAll(TestResults.getOriginalGrades()); */
        // Intelli-J refactored code
        Map<String, Integer> gradeBook = new TreeMap<>(TestResults.getOriginalGrades());

        for (Entry<String, Integer> entry : gradeBook.entrySet()) {
            String student = entry.getKey();
            int originalGrade = entry.getValue();
            int makeUpGrade = makeUpGrades.get(student);
            System.out.print(student + ": originalGrade=" + originalGrade);
            System.out.println(", makeUpGrade=" + makeUpGrade);
            if (makeUpGrade > originalGrade) {
                gradeBook.put(student, makeUpGrade);
                System.out.println("\tGrade updated to: " + makeUpGrade);
            } else
                System.out.println("\tGrade unchanged from: " + originalGrade);
        }
    }
}
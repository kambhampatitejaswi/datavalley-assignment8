import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestScoreAnalyzer {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(80);
        scores.add(90);
        scores.add(75);
        scores.add(85);
        int aboveAvg = 0, atAvg = 0, belowAvg = 0;
        double totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        double avgScore = totalScore / scores.size();

        for (int score : scores) {
            if (score > avgScore)
                aboveAvg++;
            else if (score == avgScore)
                atAvg++;
            else
                belowAvg++;
        }

        System.out.println("Above Average: " + aboveAvg);
        System.out.println("At Average: " + atAvg);
        System.out.println("Below Average: " + belowAvg);

        Collections.sort(scores);
        double median;
        if (scores.size() % 2 == 0)
            median = (scores.get(scores.size() / 2 - 1) + scores.get(scores.size() / 2)) / 2.0;
        else
            median = scores.get(scores.size() / 2);

        System.out.println("Median Score: " + median);
    }
}

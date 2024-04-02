import java.util.ArrayList;
import java.util.List;

class StudentProject {
    String name;
    int daysToComplete;

    public StudentProject(String name, int daysToComplete) {
        this.name = name;
        this.daysToComplete = daysToComplete;
    }
}

public class ProjectAnalyzer {
    public static void main(String[] args) {
        List<StudentProject> projects = new ArrayList<>();
        projects.add(new StudentProject("Project1", 5));
        projects.add(new StudentProject("Project2", 7));
        projects.add(new StudentProject("Project3", 3));
        int onTime = 0, late = 0, early = 0;
        double totalDays = 0;
        for (StudentProject project : projects) {
            if (project.daysToComplete == 7)
                onTime++;
            else if (project.daysToComplete > 7)
                late++;
            else
                early++;

            totalDays += project.daysToComplete;
        }

        int totalProjects = projects.size();
        double averageDays = totalDays / totalProjects;

        System.out.println("On time: " + onTime);
        System.out.println("Late: " + late);
        System.out.println("Early: " + early);
        System.out.println("Average time: " + averageDays);
    }
}

package Package_Assignment;
import com.school.data.*;
import com.school.util.*;
public class Runner_3 {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 85, 78, 92);
        Analyzer a = new Analyzer();
        double avg = a.calculateAverage(s);
        String grade = a.findGrade(avg);
        System.out.println(s.toString());
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
    }
}
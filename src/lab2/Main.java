package lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<CourseLike> courses = new ArrayList<>();
        courses.add(new IntroToProgrammingCourse("Intro To Programming","CS101"));
        courses.add(new IntroJavaCourse("Intro To Java","CS201"));
        courses.add(new AdvancedJavaCourse("Advanced Java","CS251"));

        for(CourseLike c: courses)
        {
            System.out.println(c);
            writeItOut(c);
        }
    }

    public static void writeItOut(CourseLike cl){
        System.out.println(cl.getCourseName());
    }
}
